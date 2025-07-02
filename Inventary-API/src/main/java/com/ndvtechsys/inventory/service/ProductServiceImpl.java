package com.ndvtechsys.inventory.service;

import com.ndvtechsys.inventory.exception.ResourceNotFoundException;
import com.ndvtechsys.inventory.model.Product;
import com.ndvtechsys.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Page<Product> getAll(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return productRepository.findAll(pageable);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + id));
    }

    @Override
    public List<Product> filterByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> filterByPrice(double min, double max) {
        return productRepository.findByPriceBetween(min, max);
    }

    @Override
    public Product update(Long id, Product newProduct) {
        Product existing = getById(id);
        existing.setName(newProduct.getName());
        existing.setCategory(newProduct.getCategory());
        existing.setQuantity(newProduct.getQuantity());
        existing.setPrice(newProduct.getPrice());
        return productRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        Product product = getById(id);
        productRepository.delete(product);
    }
}