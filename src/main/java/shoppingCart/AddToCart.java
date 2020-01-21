package shoppingCart;

import java.util.Arrays;
import java.util.List;

public class AddToCart {

    //this is list of products ordered, in the cart
    //pass this cart products to checkout and
    //pass the products from products to get there price from there names

    public static void main(String[] args) {
        List<String> items = Arrays.asList("B","B","A","A","A"); // products in cart
        Integer qty = items.size();

        Integer qtyA=0, prodQtyA=0, prodQtyB=0, qtyB=0;

        // checking qty of product A
            for (int j = 0; j < items.size(); j++) {
                if(items.get(j) == "A"){
                    prodQtyA = qtyA++;
                }else if(items.get(j) == "B"){
                    prodQtyB = qtyB++;
                }
            }

        CheckoutShoppingCart c = new CheckoutShoppingCart(items);

        Products i = new Products();

        c.checkout(i.products(),qty);
    }
}
