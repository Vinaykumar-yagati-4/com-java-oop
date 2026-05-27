package com.java.oop.inheritance;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer Name :");
        String name = sc.nextLine();

        System.out.println("Enter Product Price :");
        double price = sc.nextDouble();

        System.out.println("Enter Customer Type (1- Regular, 2-premium): ");
        int choice = sc.nextInt();

        System.out.println("\n ----- Customer details ------");

        if(choice == 1){
            RegularCustomer regularCustomer = new RegularCustomer(1,"customer1","customer1@gmail.com",(byte)23,8756456892L,10000);
            regularCustomer.displayDetails();
        }else {
            PremiumCustomer premiumCustomer = new PremiumCustomer(2,"customer2","customer2@gmail.com",(byte)24,9865785435L,10000);
            premiumCustomer.displayDetails();
        }
        sc.close();
    }
}
