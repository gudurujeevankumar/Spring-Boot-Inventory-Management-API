package com.ndvtechsys.inventory.service;

import com.ndvtechsys.inventory.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    Page<Product> getAll(int page, int size, String sortBy);

    Product getById(Long id);

    List<Product> filterByCategory(String category);

    List<Product> filterByPrice(double min, double max);

    Product update(Long id, Product product);

    void delete(Long id);
}