package com.java.oop;

public class Main {
    static void main(String[] args) {
        //local variable
        Product product = new Product(); // Product -> class name,  product -> reference variable
        product.id = 1;
        product.name = "realme TechLife 80 cm (32 inch) QLED HD Ready Smart Google TV (32HDGQRDDAQ)";
        product.rating = 4.3F;
        product.maxRetailPrice = 23999;
        product.discountPercentage = 55;
        product.isAvailable = true;
        product.reviewsCount = 26847;
        product.company = "realme ";
        product.category = "Tv";
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
    }
}
