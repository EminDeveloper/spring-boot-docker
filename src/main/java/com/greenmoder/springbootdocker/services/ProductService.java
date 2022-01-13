package com.greenmoder.springbootdocker.services;

import com.greenmoder.springbootdocker.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}