package com.digitalinnovation.experts.productcatalog.controller;

import com.digitalinnovation.experts.productcatalog.model.Product;
import com.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping("/{id}")
    public Product findById( @PathVariable Long id ){
        return productRepository.findById(id)
                .orElseThrow( () -> new ResponseStatusException( HttpStatus.NOT_FOUND, "Produto não encontrado" ));
    }
}
