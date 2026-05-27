package com.java.oop.lists.service;

import com.java.oop.lists.model.Product;

public interface ProductService {
    public void add(Product product);
    public Product findProductById(int id);
    void findAllProducts();
    void update(int id);
    void delete(Product product);
    void deleteById(int id);
}
