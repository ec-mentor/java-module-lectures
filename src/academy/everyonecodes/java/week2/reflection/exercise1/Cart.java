package academy.everyonecodes.java.week2.reflection.exercise1;

import java.util.List;

public class Cart {
    private String owner;
    private List<CartItem> cartItems;

    public Cart(String owner, List<CartItem> cartItems) {
        this.owner = owner;
        this.cartItems = cartItems;
    }

    public String getOwner() {
        return owner;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "owner='" + owner + '\'' +
                ", cartItems=" + cartItems +
                '}';
    }
}
