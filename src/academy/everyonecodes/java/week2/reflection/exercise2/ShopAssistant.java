package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    public Cart walkThroughShop(String person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + person + ", welcome to our shop!");
        String productName = "dummyProduct";
        List<CartItem> cartItems = new ArrayList<>();
        while (!productName.isEmpty()) {
            System.out.println("What do you want to buy?");
            productName = scanner.nextLine();
            if (!productName.isEmpty()) {
                System.out.println("How much does it cost?");
                double price = scanner.nextDouble();
                System.out.println("How many do you want?");
                int amount = scanner.nextInt();
                scanner.nextLine();
                Product product = new Product(productName, price);
                CartItem cartItem = new CartItem(product, amount);
                cartItems.add(cartItem);
                System.out.println("Thank you, we will put that in the cart!");
            }
        }
        System.out.println("Thank you for shopping with us!");
        return new Cart(person, cartItems);
    }
}
