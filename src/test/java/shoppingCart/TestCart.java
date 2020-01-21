package shoppingCart;

import org.junit.Test;

import java.util.*;

public class TestCart {

  class dummy{

        public HashMap<String, Integer> dummyProductsAndPrices(){
            HashMap<String,Integer> products = new HashMap();//dummy product with prices
            products.put("A", 50);
            products.put("B", 30);

            return products;
        }
    }

//    @Test
//    public void shouldBillItem(){
//        List<String> items = Arrays.asList("A","B","A","B"); //cart
//        CheckoutShoppingCart cart = new CheckoutShoppingCart(items);
//
//        Products p = new Products();
//        HashMap<String, Integer> products1 = p.products();
//
//        Integer billAmount = cart.checkout(products1,1);//checkout for total bill
//
//        assert(new Integer(160).equals(billAmount)); // compare
//    }

    @Test
    public void shouldCheck_Product_A_Offers(){
        List<String> items = Arrays.asList("A","A","A"); //cart
        CheckoutShoppingCart cart = new CheckoutShoppingCart(items);

        Products p = new Products();
        HashMap<String, Integer> products2 = p.products();

        Integer sum, qtyA = 0, qty = items.size();

        for(int i = 0 ; i < 1; i++) { // checking qty of product A
            for (int j = 0; j < items.size(); j++) {

                if (items.get(i) == items.get(j)) {
                    qtyA++;
                }
            }
        }

        if (qtyA == 3){
            System.out.println("QtyA: " + qtyA);
            sum = cart.checkout(products2, qtyA);
            assert (sum == 129);
        }
    }

    @Test
    public void shouldCheck_Product_B_Offers(){
        List<String> items = Arrays.asList("B","B"); //cart
        CheckoutShoppingCart cart = new CheckoutShoppingCart(items);

        Products p = new Products();
        HashMap<String, Integer> products2 = p.products();

        Integer sum, qtyB = 0, qty = items.size();

        for(int i = 0 ; i < 1; i++) { // checking qty of product A
            for (int j = 0; j < items.size(); j++) {

                if(items.get(i) == items.get(j)){
                    qtyB++;
                }
            }
        }
        if(qtyB == 2){
            System.out.println("QtyB: "+ qtyB);
            sum = cart.checkout(products2, qtyB);
            assert (sum == 44);
        }

    }

    @Test
    public void shouldCheckOffersOnAllItemsInCart(){
        List<String> items = Arrays.asList("B","B","B"); //cart
        CheckoutShoppingCart cart = new CheckoutShoppingCart(items);

        Products p = new Products();
        HashMap<String, Integer> products2 = p.products();

        Integer sum, qty = items.size();

            System.out.println("Qty: "+ qty);
            sum = cart.checkout(products2, qty);
            assert (sum == 75);

    }

}
