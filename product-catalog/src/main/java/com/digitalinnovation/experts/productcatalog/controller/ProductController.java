package com.digitalinnovation.experts.productcatalog.controller;

import com.digitalinnovation.experts.productcatalog.model.Product;
import com.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product create( @RequestBody Product product ){
        return productRepository.save(product);
    }
}
