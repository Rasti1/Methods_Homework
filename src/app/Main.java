package app;

import java.util.Scanner;

public class Main {

    static double purchaseAmount;
    static double discount;
    static double totalPrice;
    private static final String CURRENCY = "USD";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input sum of your purchase: ");
        purchaseAmount = sc.nextDouble();
        discount = calculationDiscount();
        totalPrice = calculationFinalPrice();
        getOutput();
    }

    private static double calculationDiscount() {
        if (purchaseAmount <= 5000) {
            discount = purchaseAmount * 5 / 100;
            System.out.println("\nYou have got 5% discount! It is equals: "
                                  + discount + CURRENCY);
            return discount;
        } else if (5000 < purchaseAmount && purchaseAmount <= 10000){
            discount =  purchaseAmount * 10 / 100;
            System.out.println("\nYou have got 10% discount! It is equals: "
                                  + discount + CURRENCY);
            return discount;
        } else {
            discount = purchaseAmount * 15 / 100;
            System.out.println("\nYou have got 15% discount! It is equals: "
                                  + discount + CURRENCY);
            return discount;
        }
    }

    private static double calculationFinalPrice(){
        totalPrice = purchaseAmount - discount;
        return totalPrice;
    }

    private static void getOutput(){
        System.out.println("\nIn conclusion:\n");
        System.out.printf("Total amount of your purchase: %.2fUSD%n", purchaseAmount);
        System.out.printf("Your discount: %.2fUSD%n", discount);
        System.out.printf("To pay: %.2fUSD%n", totalPrice);
    }

}
