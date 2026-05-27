package com.java.oop.lists;

import com.java.oop.lists.exception.ProductExistsException;
import com.java.oop.lists.exception.ProductNotFoundException;
import com.java.oop.lists.model.Product;
import com.java.oop.lists.service.ProductService;
import com.java.oop.lists.service.ProductServiceImpl;
import com.java.oop.lists.ui.ProductUI;
import com.java.oop.lists.util.InputUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductServiceImpl();
        ProductUI ui = new ProductUI();
        boolean running = true;
        while (running){
            int choice = ui.userOptionMenu();
            switch (choice){
                case 1:
                    Product product = ui.getProductDetails();
                    try{
                        service.add(product);
                    } catch (ProductExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    service.findAllProducts();
                    break;
                case 3:
                    int id = InputUtil.getInt("enter id");
                    try{
                        service.findProductById(id);
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    int updateId = InputUtil.getInt("Enter the id :");
                    try {
                        service.update(updateId);
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    int deleteId = InputUtil.getInt("enter the id :");
                    try {
                        service.deleteById(deleteId);
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Application is closed");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }

}
