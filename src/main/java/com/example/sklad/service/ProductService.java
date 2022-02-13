package com.example.sklad.service;

import com.example.sklad.entity.Product;
import com.example.sklad.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public void deleteById(UUID id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null)
            productRepository.deleteById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }


}
