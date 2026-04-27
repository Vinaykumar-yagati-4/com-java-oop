package com.java.oop.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    byte discountPercentage;
    float ratings;
    String company;
    String category;
    int reviewsCount;

    public Product(int id, String name, int maxRetailPrice, byte discountPercentage, float ratings, String company, String category, int reviewsCount) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.ratings = ratings;
        this.company = company;
        this.category = category;
        this.reviewsCount = reviewsCount;

    }
    double getDiscountedPrice(){
        return  maxRetailPrice - (maxRetailPrice*discountPercentage / 100);
    }
}
