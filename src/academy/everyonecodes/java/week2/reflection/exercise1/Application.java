package academy.everyonecodes.java.week2.reflection.exercise1;

public class Application {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 1.10);
        Product cheese = new Product("Cheese", 2.50);
        milk.setPrice(1.20);

        CartItem milkItem = new CartItem(milk, 2);
        CartItem cheeseItem = new CartItem(cheese, 1);
        cheeseItem.setAmount(3);
    }
}
