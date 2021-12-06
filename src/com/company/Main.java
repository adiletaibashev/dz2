package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(smit(20, 30));
        System.out.println(smit(15, 25));
        System.out.println(smit(33, 16));
        System.out.println(smit(18, 40));
        System.out.println(smit(5, -20));
    }

    public static String smit(int age, int temp) {
        String rezalt = "можно идти гулять";
        if (age >= 20 && age <= 45 && temp > -20 && temp < 30) {
            return rezalt;
        } else if (age < 20 && temp > 0 && temp < 28) {
            return rezalt;
        } else if (age > 45 && temp > -10 && temp < 25) {
            return rezalt;
        } else return "оставайтесь дома ";
    }
}






