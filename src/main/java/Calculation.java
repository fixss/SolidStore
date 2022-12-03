import java.util.Map;

public class Calculation {
    //SRP: A module should be responsible to one, and only one, actor.
    // Moved the sum method from the Netology Purchase class L29-39 to a separate Calculation class L12-L22
    protected Purchase[] purchases;

    public Calculation(Purchase[] purchases) {
        this.purchases = purchases;
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("BASKET:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " PCS. in total " + (purchase.count * prices.get(purchase.title)) + " rub.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}