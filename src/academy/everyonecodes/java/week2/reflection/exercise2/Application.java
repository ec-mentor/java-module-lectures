package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;

public class Application {
    public static void main(String[] args) {
        ShopAssistant assistant = new ShopAssistant();
        Cart derekCart = assistant.walkThroughShop("Derek");
        Cart hanselCart = assistant.walkThroughShop("Hansel");
        Cashier cashier = new Cashier();
        cashier.billCustomer(derekCart);
        cashier.billCustomer(hanselCart);
    }
}
