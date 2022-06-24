package com.hitsonlm.backendstorecomics.controller;

import com.hitsonlm.backendstorecomics.entity.Product;
import com.hitsonlm.backendstorecomics.repository.ProductRepository;
import com.hitsonlm.backendstorecomics.services.ProductImplServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tienda")
public class ProductController {

    @Autowired
    private ProductImplServices productImplServices;

    @Autowired
    private ProductRepository productRepository;

    //metodo GET
    @GetMapping("lista")
    public List<Product> obtenerProduct(){
        return productImplServices.getAll();
    }

}
