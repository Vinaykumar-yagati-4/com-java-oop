package com.java.oop.inheritance;

public class RegularCustomer extends Customer{
    int shippingCharges ;
    String membershipType ;

    public RegularCustomer(int id, String name, String email, char gender, byte age, long mobileNo, int shippingCharges, String membershipType) {
        super(id, name, email, gender, age, mobileNo);
        this.shippingCharges = shippingCharges;
        this.membershipType = membershipType;
    }

    double calculateFinalPrice(Product product) {
        return product.getDiscountedPrice() +shippingCharges;
    }


    void display(Product product) {
        super.display(product);
        System.out.println("membership :" +membershipType);
        System.out.println("shipping charges :" +shippingCharges);
        System.out.println("final price :" +calculateFinalPrice(product));
    }
}


