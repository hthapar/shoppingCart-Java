package shoppingCart;

import java.util.*;

class Products {

    HashMap<String,Integer> products = new HashMap();

    public HashMap<String,Integer> products() {

        products.put("A", 50);
        products.put("B", 30);
        products.put("C", 20);
        products.put("D", 15);

        return products;
    }
}

//productStore = Product (code,Price).getPriceFor(A)