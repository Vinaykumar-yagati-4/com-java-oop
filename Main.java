package com.java.oop;

public class Main {
    static void main(String[] args) {
        //local variable\
        Customer customer = new Customer();
        Product product = new Product(); // Product -> class name,  product -> reference variable
        product.id = 1;
        product.name = "realme TechLife 80 cm (32 inch) QLED HD Ready Smart Google TV (32HDGQRDDAQ)";
        product.rating = 4.3F;
        product.maxRetailPrice = 23999;
        product.discountPercentage = 55;
        product.isAvailable = true;
        product.reviewsCount = 26847;
        product.company = "realme ";
        product.category =  "Tv";
        product.displaySize = 55;
        product.manufacturedYear = 2026;
        System.out.println("id :" +product.id);
        System.out.println("name :" +product.name);
        System.out.println("Max Retail Price :" +product.maxRetailPrice);
        System.out.println("Rating :" +product.rating);
        System.out.println("Discount Percentage :" +product.discountPercentage);
        System.out.println("Is available :" +product.isAvailable);
        System.out.println("Reviews count :" +product.reviewsCount);
        System.out.println("company :" +product.company);
        System.out.println("category :" +product.category);
        System.out.println("Display size :" +product.displaySize);
        System.out.println("manufactured Year :" +product.manufacturedYear);

        Product product1 = new Product();
        product1.id = 2;
        product1.name = "Samsung Galaxy S26 Ultra 5G (Black, 512 GB) (12 GB RAM)";
        product1.rating = 4.6F;
        product1.maxRetailPrice = 134499;
        product1.discountPercentage = 16;
        product1.isAvailable = true;
        product1.reviewsCount = 462;
        product1.company = "samsung ";
        product1.category = "mobile";
        System.out.println("id :" +product1.id);
        System.out.println("name :" +product1.name);
        System.out.println("rating :" +product1.rating);
        System.out.println("Max Retail Price :" +product1.maxRetailPrice);
        System.out.println("discount percentage :" +product1.discountPercentage);
        System.out.println("is available :" +product1.isAvailable);
        System.out.println("reviews count :" +product1.reviewsCount);
        System.out.println("company :" +product1.company);
        System.out.println("category :" +product1.category);

        customer.id = 3;
        customer.name = "tarun";
        customer.email = "tarun@gmail.com";
        customer.age = 24;
        customer.gender = 'M';
        customer.mobileNumber = 9305672459L;
        System.out.println("id :" +customer.id);
        System.out.println("name :" +customer.name);
        System.out.println("email :" +customer.email);
        System.out.println("age :" +customer.age);
        System.out.println("gender :" +customer.email);
        System.out.println("mobile number :" +customer.mobileNumber);

        Customer customer2 = new Customer();
        customer2.id = 4;
        customer2.name = "anil";
        customer2.email = "anil@gmail.com";
        customer2.age = 22;
        customer2.gender = 'M';
        customer2.mobileNumber = 9308864445L;
        System.out.println("id :" + customer2.id);
        System.out.println("name :" + customer2.name);
        System.out.println("email :" + customer2.email);
        System.out.println("age :" + customer2.age);
        System.out.println("gender :" + customer2.email);
        System.out.println("mobile number :" + customer2.mobileNumber);


        Customer customer3 = new Customer();
        System.out.println("id :" + customer3.id);
        System.out.println("name :" + customer3.name);
        System.out.println("email :" + customer3.email);
        System.out.println("age :" + customer3.age);
        System.out.println("gender :" + customer3.email);
        System.out.println("mobile number :" + customer3.mobileNumber);


        Customer customer5 = new Customer(111,(byte)25,'M',"dhoni","dhoni@gmail.com",7654321890L);
        System.out.println("id :" + customer5.id);
        System.out.println("name :" + customer5.name);
        System.out.println("email :" + customer5.email);
        System.out.println("age :" + customer5.age);
        System.out.println("gender :" + customer5.email);
        System.out.println("mobile number :" + customer5.mobileNumber);



        Product product2 = new Product();
        System.out.println("id :" +product2.id);
        System.out.println("name :" +product2.name);
        System.out.println("Max Retail Price :" +product2.maxRetailPrice);
        System.out.println("Is available :" +product2.isAvailable);
        System.out.println("company :" +product2.company);
        System.out.println("category :" +product2.category);



        Product product4 = new Product(444,"dell",1000000,true,"laptop","dell");
        System.out.println("id :" +product4.id);
        System.out.println("name :" +product4.name);
        System.out.println("Max Retail Price :" +product4.maxRetailPrice);
        System.out.println("Is available :" +product4.isAvailable);
        System.out.println("company :" +product4.company);
        System.out.println("category :" +product4.category);




    }
}

