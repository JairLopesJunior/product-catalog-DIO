package com.digitalinnovation.experts.productcatalog.repository;

import com.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
