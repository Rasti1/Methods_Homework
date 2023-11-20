package app;

import java.util.Scanner;

public class Main {

    static double tip;
    static double discount;
    static double totalPrice;
    private static final String CURRENCY = "USD";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input sum of your purchase: ");
        tip = sc.nextDouble();
        calculationDiscount();
        calculationFinalPrice();
        conclusion();
    }

    private static void calculationDiscount() {
        if (tip <= 5000) {
            discount = tip * 5 / 100;
            System.out.println("\nYou have got 5% discount! It is equals: "
                                  + discount + CURRENCY);
        } else if (5000 < tip && tip <= 10000){
            discount =  tip * 10 / 100;
            System.out.println("\nYou have got 10% discount! It is equals: "
                                  + discount + CURRENCY);
        } else {
            discount = tip * 15 / 100;
            System.out.println("\nYou have got 15% discount! It is equals: "
                                  + discount + CURRENCY);
        }
    }

    private static void calculationFinalPrice(){
        totalPrice = tip - discount;
    }

    private static void conclusion(){
        System.out.println("\nIn conclusion:\n");
        System.out.printf("Total amount of your purchase: %.2fUSD%n", tip);
        System.out.printf("Your discount: %.2fUSD%n", discount);
        System.out.printf("To pay: %.2fUSD%n", totalPrice);
    }

}
