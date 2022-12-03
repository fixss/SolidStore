//Open-closed Principle.
// Class should be extendable without modifying the class itself. (Basket)

public class Purchase {
    protected String title;
    protected int count;
    Grocery Grocery = new Grocery();
    protected Purchase[] purchases;
    // Magic Number (Netology Purchase class L6: new Purchase[4] -> products.size())
    //Using in Main L15

    public void setСountProducts(int countProducts) {
        purchases = new Purchase[countProducts];
    }

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }
}