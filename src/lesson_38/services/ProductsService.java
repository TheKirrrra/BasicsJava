package lesson_38.services;

import lesson_38.models.Product;
import lesson_38.repositories.ProductsRepository;

public class ProductsService {
    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public void addProduct(String title, String description, double price) {
        if (productsRepository.isExistsByTitle(title)) {
            System.err.println("Товар с таким названием уже есть");
            return;
        }

        Product product = new Product(title, description, price);

        productsRepository.save(product);
    }

    public Product[] getAllProducts() {
        return productsRepository.findAll();
    }
}
