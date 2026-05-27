package com.java.oop.polymorphism;

import com.java.oop.inheritance.Customer;

public class CustomerService {

    public Customer add(Customer customer){
        System.out.println( "service:" +customer);
        return customer;
    }

    public void displayCustomerDetails(Customer customer){
        customer.displayDetails();
    }
}
