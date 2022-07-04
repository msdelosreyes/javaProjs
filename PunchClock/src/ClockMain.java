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

public class ClockMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInt = 0;
        ClockFunctions newEntry = new ClockFunctions();
        
        while (true) {
            
            System.out.println("         Welcome");
            System.out.println("1 Start Shift    5 Sweep Log");
            System.out.println("2 Start Lunch    6 Last Punch");
            System.out.println("3 End Lunch");
            System.out.println("4 End Shift");
            System.out.print("      " + java.time.LocalDate.now() + " ");
            System.out.println(java.time.LocalTime.now());
            
            while ( (userInt < 1) || (userInt > 6) ) {
                try {
                    userInt = sc.nextInt();
                }
                catch (Exception e) {
                    sc.nextLine();
                    System.out.println();
                    System.out.println("Error! Enter a number 1 through 6");
                    continue;
                }
                if (userInt < 1 || userInt > 6) {
                    System.out.println();
                    System.out.println("Error! Enter a number 1 through 6");
                }
            }
            
            if (userInt == 1) {
                newEntry.startShift();
                userInt = 0;
            }
            else if (userInt == 2) {
                newEntry.startLunch();
                userInt = 0;
            }
            else if (userInt == 3) {
                newEntry.endLunch();
                userInt = 0;
            }
            else if (userInt == 4) {
                newEntry.endShift();
                userInt = 0;
            }
            else if (userInt == 5) {
                newEntry.sweepLog();
                userInt = 0;
            }
            else if (userInt == 6) {
                newEntry.lastPunch();
                userInt = 0;
            }
            
            System.out.println();
        }
    }
    
}
