package mate.academy.springboot.datajpa.service;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.datajpa.model.Product;

public interface ProductService {
    Product save(Product product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product update(Product product);

    List<Product> findAllPriceBetween(BigDecimal from, BigDecimal to);

    List<Product> findAllByCategory(List<String> categories);
}