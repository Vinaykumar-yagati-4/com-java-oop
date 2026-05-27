package com.java.oop.strings;

public class StringDemo {
    static void main(String[] args) {
        //creation of strings
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        //concatenation of Strings
        String str3 = "hello !";
        String str4 = " how are you ?";
        String result = (str3.concat(str4));
        System.out.println(result);
        // length of strings
        System.out.println(str1.length());
        System.out.println(str4.length());

        //uppercase and lowercase
        String str5 = "WELCOME";
        System.out.println(str1.toUpperCase());
        System.out.println(str5.toLowerCase());

        //substring
        String str6 = "welcome to programming";
        String str7 = str6.substring(0,14);
        System.out.println(str7);

        //contains a string
        System.out.println(str6.contains("welcome"));
        System.out.println(str6.contains("hii"));

        //replace a word
        String str8 = str6.replace("programming","java");
        System.out.println(str8);
        String str9 = str6.replace("o","a");
        System.out.println(str9);

        //split
        String data = "apple,orange,grapes";
        String[] fruits = data.split(",");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        //convert string to integer
        String number = "123";
        int num = Integer.parseInt(number);
        System.out.println(num + 10);

        //reverse a string
        String s1 = "java";
        String  s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(s2);

        //remove trailing and leading spaces

        String s3 = "   java programming  "; //remove whitespaces
        System.out.println(s3.trim());

        //remove all spaces
        System.out.println(s3.replaceAll("\\s+","")); //remove all spaces

    }
}
