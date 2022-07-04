/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msdel
 */

import java.util.Scanner;

public class CafeOrder {
    private int breakfastOrLunch;
    private int[] coffeeArray = new int[100];
    private String[] coffeeItems = new String[]{"Espresso","Latte","Cappucino","Cold Brew"};
    private double[] coffeePrices = new double[]{3.50,3.50,5.00,3.00};
    private int[] coffeeItemCount = new int[]{0, 0, 0, 0};
    private int coffeeLength = 0;
    private int[] foodArray = new int[100];
    private String[] breakfastItems = new String[]{"Pancakes","Belgian Waffle","French Toast","Breakfast Burrito","Side Selection"};
    private double[] breakfastPrices = new double[]{3.00,4.00,3.00,5.50,0.50};
    private String[] lunchItems = new String[]{"Tuna Sandwich","Chicken Sandwich","Burrito","Yogurt Bowl","Avacado Toast"};
    private double[] lunchPrices = new double[]{8.00,8.00,10.00,4.00,3.00};
    private int[] foodItemCount = new int[]{0, 0, 0, 0, 0};
    private int foodLength = 0;
    private String nameOfCustomer;
    private Scanner scnr = new Scanner(System.in);
    private double orderTotal = 0;
    public String receipt;
    private String[] coffeePrint = new String[100];
    private String[] foodPrint = new String[100];
    private StringBuilder receiptOutput = new StringBuilder();
    
    public void setFoodType(int bOrL) {
        breakfastOrLunch = bOrL;    
    }
    
    public int getFoodType() {
        return breakfastOrLunch;
    }
    
    public void setCoffeeOrder(int i, int coffeeNum) {
        coffeeArray[i] = coffeeNum;
    }
    
    public int getCoffeeOrder(int i) {
        return coffeeArray[i];
    }
    
    public void setFoodOrder(int i, int foodNum) {
        foodArray[i] = foodNum;
    }
    
    public int getFoodOrder(int i) {
        return foodArray[i];
    }
    
    public void setCustomerName(String customerName) {
        nameOfCustomer = customerName;
    }
    
    public String getCustomerName() {
        return nameOfCustomer;
    }
    
    public StringBuilder getReceiptOrder() {
        return receiptOutput;
    }
    
    public void selectBreakfastOrLunch(int bOrL) {
        while ( (bOrL < 1) || (bOrL > 2)) {
            try {
                bOrL = scnr.nextInt();
            }
            catch(Exception e) {
                scnr.next();
                System.out.println();
                System.out.println("Error! Input must be 1 or 2.");
                System.out.print("Select Breakfast or Lunch [1, 2]: ");
                continue;
            }
            if ( (bOrL != 1) && (bOrL != 2) ) {
                System.out.println();
                System.out.println("Error! Input must be 1 or 2.");
                System.out.print("Select Breakfast or Lunch [1, 2]: ");
            }  
        }
        this.setFoodType(bOrL);
    }
    
    public void coffeeOrder(int coffee) { 
        for (int i = 0; i < coffeeArray.length; i++) {
            while ( (coffee < 1) || (coffee > 5)) {
                try {
                    coffee = scnr.nextInt();
                }
                catch(Exception e) {
                    scnr.next();
                    System.out.println();
                    System.out.println("Error! Input must be 1 through 5.");
                    System.out.print("Select a coffee [1, 5]: ");
                    continue;
                }
                if ( (coffee < 1) || (coffee > 5)) {
                    System.out.println();
                    System.out.println("Error! Input must be 1 through 5.");
                    System.out.print("Select a coffee [1, 5]:" );
                }
            }
            if ( (coffee >= 1) && (coffee <= 4)) {
                this.setCoffeeOrder(i, coffee);
                System.out.println();
                System.out.println("=== Select Coffee ===");
                System.out.println("1 Espresso       $3.50");
                System.out.println("2 Latte          $3.50");
                System.out.println("3 Cappucino      $5.00");
                System.out.println("4 Cold Brew      $3.00");
                System.out.println("5 Quit Coffee Selection");
                System.out.println();
                System.out.print("Select a coffee [1, 5]: ");
                coffeeLength += 1;
                coffee = 0;
            }
            else if (coffee == 5) {
                break;
            }
        } 
    }
    
    public void foodOrder() {
        if (this.getFoodType() == 1) {
            System.out.println("=== Select Breakfast Food ===");
            System.out.println("1. Pancakes             $3.00");
            System.out.println("2. Belgian Waffle       $4.00");
            System.out.println("3. French Toast         $3.00");
            System.out.println("4. Breakfast Burrito    $5.50");
            System.out.println("5. Side Selection       $0.50");
            System.out.println("6 Quit Breakfast selection");
            System.out.println();
            System.out.print("Select a breakfast item [1, 6]: ");
            int bNum = 0;
            
            for (int i = 0; i < foodArray.length; i++) {
                while ( (bNum < 1) || (bNum > 6)) {
                    try {
                        bNum = scnr.nextInt();
                    }
                    catch (Exception e){
                        scnr.next();
                        System.out.println();
                        System.out.println("Error! Input must be 1 through 6.");
                        System.out.print("Select a breakfast item [1, 6]: ");
                        continue;
                    }
                    if ( (bNum < 1) || (bNum > 6)) {
                        System.out.println();
                        System.out.println("Error! Input must be 1 through 6.");
                        System.out.print("Select a breakfast item [1, 6]: ");
                    }
                }
                if ( (bNum >= 1) && (bNum <= 5)){
                    this.setFoodOrder(i, bNum);
                    System.out.println();
                    System.out.println("=== Select Breakfast Food ===");
                    System.out.println("1. Pancakes             $3.00");
                    System.out.println("2. Belgian Waffle       $4.00");
                    System.out.println("3. French Toast         $3.00");
                    System.out.println("4. Breakfast Burrito    $5.50");
                    System.out.println("5. Side Selection       $0.50");
                    System.out.println("6 Quit Breakfast selection");
                    System.out.println();
                    System.out.print("Select a breakfast item [1, 6]: ");
                    foodLength += 1;
                    bNum = 0;
                }
                else if (bNum == 6) {
                    break;
                }
            }
        }
        else {
            System.out.println("=== Select Lunch Food ===");
            System.out.println("1. Tuna Sandwich    $8.00");
            System.out.println("2. Chicken Sandwich $8.00");
            System.out.println("3. Burrito         $10.00");
            System.out.println("4. Yogurt Bowl      $4.00");
            System.out.println("5. Avacado Toast    $3.00");
            System.out.println("6. Quit Food selection");
            System.out.println();
            System.out.print("Select a lunch item [1, 6]: ");
            int lNum = 0;
            
            for (int i = 0; i < foodArray.length; i++) {
                while ( (lNum < 1) || (lNum > 6)) {
                    try {
                        lNum = scnr.nextInt();
                    }
                    catch (Exception e){
                        scnr.next();
                        System.out.println();
                        System.out.println("Error! Input must be 1 through 6.");
                        System.out.print("Select a lunch item [1, 6]: ");
                        continue;
                    }
                    if ( (lNum < 1) || (lNum > 6)) {
                        System.out.println();
                        System.out.println("Error! Input must be 1 through 6.");
                        System.out.print("Select a lunch item [1, 6]: ");
                    }
                }
                if ( (lNum >= 1) && (lNum <=5)){
                    this.setFoodOrder(i, lNum);
                    System.out.println();
                    System.out.println("=== Select Lunch Food ===");
                    System.out.println("1. Tuna Sandwich    $8.00");
                    System.out.println("2. Chicken Sandwich $8.00");
                    System.out.println("3. Burrito         $10.00");
                    System.out.println("4. Yogurt Bowl      $4.00");
                    System.out.println("5. Avacado Toast    $3.00");
                    System.out.println("6. Quit Food selection");
                    System.out.println();
                    System.out.print("Select a lunch item [1, 6]: ");
                    foodLength+= 1;
                    lNum = 0;
                }
                else if (lNum == 6) {
                    break;
                }
            }
        }
    }
    
    public void foodCounter(int fNum1, int fNum2, int fNum3, int fNum4, int fNum5) {
        for (int i = 0; i < foodLength; i++) {
            if (foodArray[i] == fNum1) {
                foodItemCount[0] += 1;
            }
            else if (foodArray[i] == fNum2) {
                foodItemCount[1] += 1;
            }
            else if (foodArray[i] == fNum3) {
                foodItemCount[2] += 1;
            }
            else if (foodArray[i] == fNum4) {
                foodItemCount[3] += 1;
            }
            else if (foodArray[i] == fNum5) {
                foodItemCount[4] += 1;
            }
        }
    }
    
    public void coffeeCounter(int cNum1, int cNum2, int cNum3, int cNum4) {
        for (int i = 0; i < coffeeLength; i++) {
            if (coffeeArray[i] == cNum1) {
                coffeeItemCount[0] += 1;
            }
            else if (coffeeArray[i] == cNum2) {
                coffeeItemCount[1] += 1;
            }
            else if (coffeeArray[i] == cNum3) {
                coffeeItemCount[2] += 1;
            }
            else if (coffeeArray[i] == cNum4) {
                coffeeItemCount[3] += 1;
            }
        }
    }
    
    public void printInfo() {
        if (this.getFoodType() == 1) {
            System.out.print("Breakfast, ");
            receiptOutput.append("Breakfast, ");
        }
        else {
            System.out.print("Lunch, ");
            receiptOutput.append("Lunch, ");
        }
        System.out.print(nameOfCustomer + ", ");
        for (int i = 0; i < coffeeLength; i++) {
            if (coffeeArray[i] == coffeeArray[i+1]) {
                orderTotal += coffeePrices[coffeeArray[i]-1];
                continue;
            }
            System.out.print(coffeeItems[coffeeArray[i]-1] + " (" + coffeeItemCount[coffeeArray[i]-1] + "), ");
            receiptOutput.append(coffeeItems[coffeeArray[i]-1] + " (" + coffeeItemCount[coffeeArray[i]-1] + "), ");
            orderTotal += coffeePrices[coffeeArray[i]-1];
        }
        for (int i = 0; i < foodLength; i++) {
            if (foodArray[i] == foodArray[i+1]) {
                if (breakfastOrLunch == 1) {
                    orderTotal += breakfastPrices[foodArray[i]-1];
                }
                else {
                    orderTotal += lunchPrices[foodArray[i]-1];
                }
                continue;
            }
            if (breakfastOrLunch == 1) {
                System.out.print(breakfastItems[foodArray[i]-1] + " (" + foodItemCount[foodArray[i]-1] + "), ");
                receiptOutput.append(breakfastItems[foodArray[i]-1] + " (" + foodItemCount[foodArray[i]-1] + "), ");
                orderTotal += breakfastPrices[foodArray[i]-1];
            }
            else {
                System.out.print(lunchItems[foodArray[i]-1] + " (" + foodItemCount[foodArray[i]-1] + "), ");
                receiptOutput.append(lunchItems[foodArray[i]-1] + " (" + foodItemCount[foodArray[i]-1] + "), ");
                orderTotal += lunchPrices[foodArray[i]-1];
            }
        }
        System.out.println("$" + String.format("%.2f",orderTotal));
        receiptOutput.append("$" + String.format("%.2f",orderTotal));
    }
}