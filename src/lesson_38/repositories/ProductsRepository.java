package lesson_38.repositories;

import lesson_38.models.Product;

public class ProductsRepository {

    Product[] products;

    private int productsCount;

    public void save(Product product) {
        this.products[productsCount] = product;
        this.productsCount++;
    }

    public boolean isExistsByTitle(String title) {
        for (int i = 0; i < productsCount; i++) {
            if (products[i].getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public Product[] findAll() {
        Product[] copy = new Product[productsCount];
        for (int i = 0; i < productsCount; i++) {
            copy[i] = products[i];
        }
        return copy;
    }
}
