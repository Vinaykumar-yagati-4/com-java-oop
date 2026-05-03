package com.java.oop.polymorphism;

import com.java.oop.inheritance.Customer;
import com.java.oop.inheritance.PremiumCustomer;
import com.java.oop.inheritance.RegularCustomer;

public class Main {
    static void main(String[] args) {

        CustomerService service = new CustomerService();
        //service.add(regularCustomer);

        Customer customer = new Customer(11,"raju","raju@gmail.com",'M',(byte)23,8906754385L);

        System.out.println(customer);
        //com.java.oop.inheritance.Customer@8efb846
        //class@hashcode

        PremiumCustomer premiumCustomer = new PremiumCustomer(14,"anil","anil@gmail.com",'M',(byte)23,6302586059L,0,"gold");
        System.out.println(premiumCustomer);

        RegularCustomer regularCustomer = new RegularCustomer(1,"tarun","tarun@gmail.com",'M',(byte)24,9870654378L,50,"silver");
        System.out.println(regularCustomer);

        service.displayCustomerDetails(premiumCustomer);

    }
}
