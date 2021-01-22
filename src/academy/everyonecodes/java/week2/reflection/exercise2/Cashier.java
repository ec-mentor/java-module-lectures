package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;

public class Cashier {
    public void billCustomer(Cart cart) {
        double sum = 0;
        for (CartItem item : cart.getCartItems()) {
            sum += item.getProduct().getPrice() * item.getAmount();
        }
        System.out.println(cart.getOwner() + " has to pay " + sum + " Euros.");
    }
}
