import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Purchase purchase = new Purchase();
        //Liskov substitution principle, requires the objects of your subclasses to behave in the same way as the objects of your superclass.(Product)

        Grocery grocery = new Grocery();
        grocery.addProduct("Bread", 56);
        grocery.addProduct("Butter", 153);
        grocery.addProduct("Sausage", 211);
        grocery.addProduct("Pie", 45);
        purchase.setСountProducts(grocery.products.size());

        System.out.println("IN STORE AVAILABLE");
        //SRP: A module should be responsible to one, and only one, actor. Moved the printProducts() method to the Grocery class
        //Netology Main class L15-L17 -> Grocery class L18-L22
        grocery.printProducts();


        System.out.println("Enter two words: product name and quantity. Or end");
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if ("end".equals(line)) break;
                String[] parts = line.split(" ");
                String product = parts[0];
                int count = Integer.parseInt(parts[1]);
                purchase.addPurchase(product, count);
            }
        } catch (Exception e) {
            System.out.println("Input Error");
            throw new RuntimeException(e);
        }

        Calculation calculation = new Calculation(purchase.purchases);
        long sum = calculation.sum(grocery.products);

        System.out.println("TOTAL: " + sum);
    }

    @Override
    public String toString() {
        return "Main []";
    }
}