package com.hitsonlm.backendstorecomics.repository;

import com.hitsonlm.backendstorecomics.entity.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

    // ya tiene por default los metods de un CRUD

}
