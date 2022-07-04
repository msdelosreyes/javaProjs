/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msdel
 */

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CafeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scnr = new Scanner(System.in);
        CafeOrder newOrder = new CafeOrder();
        int bOrL = 0;
        int coffee = 0;
        String customerName;
        File newFile = new File("order.txt");
        FileOutputStream fileStream = new FileOutputStream("order.txt");
        PrintWriter outOrder = new PrintWriter(fileStream);
        
        System.out.println("=== Select Breakfast or Lunch ===");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println();
        System.out.print("Select Breakfast or Lunch [1, 2]: ");
        
        newOrder.selectBreakfastOrLunch(bOrL);
        System.out.println();
        
        System.out.println("=== Select Coffee ===");
        System.out.println("1 Espresso       $3.50");
        System.out.println("2 Latte          $3.50");
        System.out.println("3 Cappucino      $5.00");
        System.out.println("4 Cold Brew      $3.00");
        System.out.println("5 Quit Coffee Selection");
        System.out.println();
        System.out.print("Select a coffee [1, 5]: ");
        
        newOrder.coffeeOrder(coffee);
        System.out.println();
        
        newOrder.foodOrder();
        System.out.println();
                
        System.out.print("Enter customer's name: ");
        customerName = scnr.nextLine();
        newOrder.setCustomerName(customerName);
        
        newOrder.coffeeCounter(1, 2, 3 ,4);
        newOrder.foodCounter(1, 2, 3, 4, 5);
        
        System.out.println();
        System.out.println("Receipt:");
        newOrder.printInfo();

        outOrder.println(newOrder.getReceiptOrder());
        outOrder.close();
    }
}
