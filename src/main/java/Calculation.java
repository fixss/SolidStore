package src.main.java;

import java.util.Map;

public class Calculation {
    //SRP: A module should be responsible to one, and only one, actor.  Moved the sum method from the Purchase class to a separate class
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