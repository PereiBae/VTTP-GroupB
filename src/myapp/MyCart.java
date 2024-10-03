package myapp;

import java.io.Console;

public class MyCart {

    // Number iof items in your cart
    // Add item 1:
    // Add item 2:
    // Add item 3:

    // contents of your cart is:
    // list the cart contents
    
    public static void main(String[] args){

        Console cons = System.console();

        String input = cons.readLine("Number of items in your cart? ");
        int itemCount = Integer.parseInt(input);

        // create the cart
        String [] cart = new String [itemCount];

        for(int idx = 0; idx < cart.length; idx++){
            // input = cons.readLine("Add items %d", idx+1);
            // cart[idx]= input;
            cart[idx] = cons.readLine("Add items %d", idx+1);
        }

        for (int idx=0; idx< cart.length; idx++){
            System.out.printf("%d.%s\n", idx+1,cart[idx]);
        }

    }

}
