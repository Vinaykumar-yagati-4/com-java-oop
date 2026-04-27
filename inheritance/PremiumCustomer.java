package com.java.oop.inheritance;

public class PremiumCustomer extends Customer {
    int shippingCharges;
    String membershipType;

    public PremiumCustomer(int id, String name, String email, char gender, byte age, long mobileNo, int shippingCharges, String membershipType) {
        super(id, name, email, gender, age, mobileNo);
        this.shippingCharges = shippingCharges;
        this.membershipType = membershipType;
    }

    double calculateFinalPrice(Product product) {
        double price = product.getDiscountedPrice();
        return  price - (price * product.discountPercentage / 100);
    }

    void display(Product product) {
        super.display(product);
        System.out.println("membership :" +membershipType);
        System.out.println("shipping charges :" +shippingCharges);
        System.out.println("extra discount : +20%");
        System.out.println("final price :" +calculateFinalPrice(product));
    }
}
