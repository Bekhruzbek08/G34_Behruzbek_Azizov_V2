import java.util.HashMap;
import java.util.Map;

class Customer {
    private final Map<Integer, Integer> purchaseHistory = new HashMap<>();

    public void purchaseProduct(int productId, int quantity, Map<Integer, Product> products) {

        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            if (product.getQuantity() >= quantity) {
                product.getQuantity(product.getQuantity() - quantity);
                purchaseHistory.put(productId, quantity);
                System.out.println("Purchase successful. Thank you!");
            } else {
                System.out.println("Not enough quantity available for the purchase.");
            }
        } else {
            System.out.println("Product not found.");
        }
    }

}
