/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.storediscount;

import java.util.Scanner;

public class StoreDiscount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the total purchase amount (in R): ");
            double totalAmount = scanner.nextDouble();
            double discount = 0;
            
            if (totalAmount > 500) {
                if (totalAmount > 1000) {
                    discount = 0.20;
                } else {
                    discount = 0.10;
                }
            } else {
                discount = 0.0;
            }
            
            double discountedAmount = totalAmount - (totalAmount * discount);
            System.out.printf("Discount applied: %.0f%%\n", discount * 100);
            System.out.printf("Final amount after discount: R%.2f\n", discountedAmount);
        }
    }
}
