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
import java.util.InputMismatchException;

public class ClockFunctions {
    private String[] eFNames = new String[]{"Jocilyn","Julia","Julian","Nadia","Max"};
    private String[] eLNames = new String[]{"Torres","Ortega","Villagran","Torres","De Los Reyes"};
    private String[] lastPunchArr = new String[]{"", "", "", "", ""};
    private int[] eIDs = new int[]{1, 2, 3, 4, 5};
    private int id;
    private int sweepNum;
    private String startTime;
    private String endTime;
    private String startLTime;
    private String endLTime;
    private String sweepTime;
    private Scanner sc = new Scanner(System.in);
    private StringBuilder lastPunch = new StringBuilder();
    
    public void startShift() {
        System.out.println();
        System.out.println("Enter ID: Start Shift");
        
        while (true) {
            try {
              id = sc.nextInt();
            }
            catch (Exception e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Start Shift");
                continue;
            }
            if (id != 1 && id != 2 && id != 3 && id != 4 && id != 5) {
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Start Shift");
                continue;
            }
            else if (id == 1 || id == 2 || id == 3 || id == 4 || id == 5) {
                System.out.println();
                break;
            }
        }
        
        for (int i = 0; i < eIDs.length; i++) {
            if (id == eIDs[i]) {
                System.out.println(eLNames[i] + ", " + eFNames[i] + " ON at " + java.time.LocalTime.now());
                startTime = java.time.LocalTime.now().toString();
                lastPunch.delete(0, lastPunch.length());
                lastPunch.append(eLNames[i] + ", " + eFNames[i] + " ON at " + startTime);
                lastPunchArr[i] = lastPunch.toString();
            }
            else if (id != eIDs[i]) {
                continue;
            }
        }
    }        
    
    public void startLunch() {
        System.out.println();
        System.out.println("Enter ID: Start Lunch");
        
        while (true) {
            try {
              id = sc.nextInt();
            }
            catch (Exception e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Start Lunch");
                continue;
            }
            if (id != 1 && id != 2 && id != 3 && id != 4 && id != 5) {
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Start Lunch");
                continue;
            }
            else if (id == 1 || id == 2 || id == 3 || id == 4 || id == 5) {
                System.out.println();
                break;
            }
        }
        
        for (int i = 0; i < eIDs.length; i++) {
            if (id == eIDs[i]) {
                System.out.println(eLNames[i] + ", " + eFNames[i] + " OFF at " + java.time.LocalTime.now());
                startLTime = java.time.LocalTime.now().toString();
                lastPunch.delete(0, lastPunch.length());
                lastPunch.append(eLNames[i] + ", " + eFNames[i] + " OFF at " + startLTime);
                lastPunchArr[i] = lastPunch.toString();
            }
            else if (id != eIDs[i]) {
                continue;
            }
        }
    }
    
    public void endLunch() {
        System.out.println();
        System.out.println("Enter ID: End Lunch");
        
        while (true) {
            try {
              id = sc.nextInt();
            }
            catch (Exception e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: End Lunch");
                continue;
            }
            if (id != 1 && id != 2 && id != 3 && id != 4 && id != 5) {
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: End Lunch");
                continue;
            }
            else if (id == 1 || id == 2 || id == 3 || id == 4 || id == 5) {
                System.out.println();
                break;
            }
        }
        
        for (int i = 0; i < eIDs.length; i++) {
            if (id == eIDs[i]) {
                System.out.println(eLNames[i] + ", " + eFNames[i] + " ON at " + java.time.LocalTime.now());
                endLTime = java.time.LocalTime.now().toString();
                lastPunch.delete(0, lastPunch.length());
                lastPunch.append(eLNames[i] + ", " + eFNames[i] + " ON at " + endLTime);
                lastPunchArr[i] = lastPunch.toString();
            }
            else if (id != eIDs[i]) {
                continue;
            }
        }
    }
    
    public void endShift() {
        System.out.println();
        System.out.println("Enter ID: End Shift");
        
        while (true) {
            try {
              id = sc.nextInt();
            }
            catch (Exception e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: End Shift");
                continue;
            }
            if (id != 1 && id != 2 && id != 3 && id != 4 && id != 5) {
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: End Shift");
                continue;
            }
            else if (id == 1 || id == 2 || id == 3 || id == 4 || id == 5) {
                System.out.println();
                break;
            }
        }
        
        for (int i = 0; i < eIDs.length; i++) {
            if (id == eIDs[i]) {
                System.out.println(eLNames[i] + ", " + eFNames[i] + " OFF at " + java.time.LocalTime.now());
                endTime = java.time.LocalTime.now().toString();
                lastPunch.delete(0, lastPunch.length());
                lastPunch.append(eLNames[i] + ", " + eFNames[i] + " OFF at " + endTime);
                lastPunchArr[i] = lastPunch.toString();
            }
            else if (id != eIDs[i]) {
                continue;
            }
        }
    }
    
    public void sweepLog() {
        System.out.println();
        System.out.println("Enter ID: Sweep Log");
        
        while (true) {
            try {
              id = sc.nextInt();
            }
            catch (Exception e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Sweep Log");
                continue;
            }
            if (id != 1 && id != 2 && id != 3 && id != 4 && id != 5) {
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Sweep Log");
                continue;
            }
            else if (id == 1 || id == 2 || id == 3 || id == 4 || id == 5) {
                System.out.println();
                break;
            }
        }
        
        while (true) {
            System.out.println("       Log Sweep");
            System.out.println("1 Grocery         5 All");
            System.out.println("2 Produce");
            System.out.println("3 Lobby");
            System.out.println("4 Bathroom");
            
            try {
                sweepNum = sc.nextInt();
            }
            catch (Exception e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Error! Number must be 1 through 5");
                System.out.println();
                continue;
            }
            if ( sweepNum < 1 || sweepNum > 5 ) {
                System.out.println();
                System.out.println("Error! Number must be 1 through 5");
                System.out.println();
                continue;
            }
            else if ( sweepNum > 0 && sweepNum < 6) {
                System.out.println();
                break;
            }
        }
        
        for (int i = 0; i < eIDs.length; i++) {
            if (id == eIDs[i]) {
                System.out.println(eLNames[i] + ", " + eFNames[i] + " SWEEP at " + java.time.LocalTime.now());
                sweepTime = java.time.LocalTime.now().toString();
                lastPunch.delete(0, lastPunch.length());
                lastPunch.append(eLNames[i] + ", " + eFNames[i] + " SWEEP at " + sweepTime);
                lastPunchArr[i] = lastPunch.toString();
            }
            else if (id != eIDs[i]) {
                continue;
            }
        }
    }
    
    public void lastPunch() {
        System.out.println();
        System.out.println("Enter ID: Last Punch");
        
        while (true) {
            try {
              id = sc.nextInt();
            }
            catch (Exception e) {
                sc.nextLine();
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Last Punch");
                continue;
            }
            if (id != 1 && id != 2 && id != 3 && id != 4 && id != 5) {
                System.out.println();
                System.out.println("Error! Invalid ID");
                System.out.println("Enter ID: Last Punch");
                continue;
            }
            else if (id == 1 || id == 2 || id == 3 || id == 4 || id == 5) {
                System.out.println();
                break;
            }
        }
        
        for (int i = 0; i < eIDs.length; i++) {
            if (id == eIDs[i]) {
                if (lastPunch.length() == 0) {
                    System.out.println();
                    System.out.println("No punches have been entered");
                }
                else { 
                    System.out.println(lastPunchArr[i]);
                }
            } else {
                continue;
            }
        }
    }
}
