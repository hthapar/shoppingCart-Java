package shoppingCart;

import java.util.HashMap;
import java.util.List;

public class CheckoutShoppingCart {
    private List<String> item; // items in cart

    public CheckoutShoppingCart(List<String> item) {
        this.item = item;
    }

    public Integer checkout(HashMap<String,Integer> plist , Integer totalCartQuantity){
        Integer totalSum = 0, sumA = 0, sumB = 0, newPrice;

        for (int i = 0; i<item.size(); i++){

            //getting item from cart storing it in product
            String productName = item.get(i);

            // and then getting its price from my product DB List
            Integer originalPrice = plist.get(productName);

            if(((totalCartQuantity == 3) && (productName == "A"))){
                newPrice = 130/3;
                sumA += newPrice;
                totalSum = sumA;
            }
            else if ((totalCartQuantity == 2) && (productName == "B")){
                newPrice = 45/2;
                sumB += newPrice;
                totalSum = sumA + sumB;
            }
            else {
                totalSum += originalPrice;
            }
        }
        System.out.println("Total Billing Amount: Rs." + totalSum);
        return totalSum;
    }
}
