package com.hitsonlm.backendstorecomics.services;

import com.hitsonlm.backendstorecomics.entity.Product;
import com.hitsonlm.backendstorecomics.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices implements ProductImplServices{

    // inyeccion de dependecia.
    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }
}
