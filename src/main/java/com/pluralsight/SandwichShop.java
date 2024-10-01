package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args){
        double basePrice = costOfSandwich();
        double discount  = discount();

        double totalCost = basePrice * (1 - discount);
        System.out.println("The total cost of the sandwich will be: " + totalCost);




    }
    public static double costOfSandwich(){
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.println("Please select 1 or 2: ");
        int size = myscanner.nextInt();
        myscanner.nextLine();
        double basePrice = 0.0;
        if (size == 1){
            basePrice = 5.45;
        }else{
            basePrice = 8.95;
        }

        return basePrice;
    }

    public static double discount(){
        System.out.println("Please enter your age: ");
        int age = myscanner.nextInt();
        myscanner.nextLine();
        double discount = 0.0;
        if (age < 18){
            discount = .1;
        }else{
            discount = .2;
        }
        return discount;
    }


}
