import java.util.HashMap;
import java.util.Map;

class Owner {
    private Map<Integer, Product> products = new HashMap<>();
    private int productCounter = 1;

    public void addProduct(String name, String category, double price, int quantity) {
        Product product = new Product(productCounter++, name, category, price, quantity);
        products.put(product.getId(), product);
        System.out.println("Product added: " + product);
    }

    // Other owner-related methods...

    public Map<Integer, Product> getProducts() {
        return products;
    }
    public void editProduct(int productId, String name, String category, double price, int quantity) {
        if (products.containsKey(productId)) {
            Product editedProduct = products.get(productId);
            editedProduct.setName(name);
            editedProduct.setCategory(category);
            editedProduct.setPrice(price);
            editedProduct.setQuantity(quantity);
            System.out.println("Product edited: " + editedProduct);
        } else {
            System.out.println("Product not found. Edit failed.");
        }
    }
}