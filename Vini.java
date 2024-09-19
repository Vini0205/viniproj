/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vini;

import java.util.Scanner;

/**
 *Import java util.Scanner;
 * @author CALUNOD_COMP111
 */
public class Vini {

    public static void main(String[] args) {
        
          Scanner input=new Scanner(System.in);
          System.out.println("D/Furious");
        String again;
        double total=0;
        double h;
       
        do{
            int FM = 350;
            int HC = 387;
            int JP = 339;
            int MS = 479;
            int LC = 573;
            int PC = 728;
            int GT = 1250;
            double N;
            double currenttotal=0;
             System.out.println("Car Model:\n"
                + "TYPE: 'FM' for Ford Mustang .................350\n"
                + "TYPE: 'HC' for Honda Civic Type R ...........387\n"
                + "TYPE: 'JP' for Jeep Wrangler ................339\n"
                + "TYPE: 'MS' for BMW M Series .................479\n"
                + "TYPE: 'LC' for Land Cruiser .................573\n"
                + "TYPE: 'PC' for Porche 911 Carrera S .........728\n"
                + "TYPE: 'GT' for Nissan GT-R ..................1250");
             System.out.println("SELECT YOUR DESIRE CARS");
             String select=input.next();
               if (select.equalsIgnoreCase("FM")){
                    System.out.println("YOU SELECT Ford Mustang: ");
                    System.out.println(" ENTER QUANTITY");
                    N = input.nextDouble();
                    currenttotal=FM*1;
                } else if (select.equalsIgnoreCase("HC")) {
                    System.out.println("YOU SELECT Honda Civic Type R: ");
                     System.out.println(" ENTER QUANTITY");
                    N=input.nextDouble();
                   currenttotal=HC*1;
                } else if (select.equalsIgnoreCase("JP")) {
                    System.out.println("YOU SELECT JEEP WRANGLER: ");
                     System.out.println(" ENTER QUANTITY");
                    N=input.nextDouble();
                    currenttotal=JP*1;
                } else if (select.equalsIgnoreCase("MS")) {
                    System.out.println("YOU SELECT BMW M SERIES: ");
                     System.out.println(" ENTER QUANTITY");
                    N=input.nextDouble();
                   currenttotal=MS*1;
                } else if (select.equalsIgnoreCase("LC")) {
                    System.out.println("YOU SELECT LAND CRUISER:" );
                     System.out.println(" ENTER QUANTITY");
                    N=input.nextDouble();
                    currenttotal=LC*1;
                } else if (select.equalsIgnoreCase("PC")) {
                    System.out.println("YOU SELECT PORCHE 911 CARRERA S:" );
                     System.out.println(" ENTER QUANTITY");
                    N=input.nextDouble();
                    currenttotal=PC*1;
                } else if (select.equalsIgnoreCase("GT")) {
                    System.out.println("YOU SELECT NISSAN GT-R:" ) ;
                     System.out.println(" ENTER QUANTITY");
                    N=input.nextDouble();
                    currenttotal=GT*1;
                }
                else {
                    System.out.println("NOT VALID");
                }
               total +=currenttotal;
               System.out.println("YOUR TOTAL BILLS: "+total);
                   System.out.print("ENTER: 'yes' IF BUY AGAIN AND 'no' IF STOP ");
            again = input.next();
            if(again.equals("yes")){
            System.out.println("ADD ANOTHER CAR");
        }else if (again.equals("no")){
            System.out.println("done");
        }
        } while (again.equalsIgnoreCase("yes"));
       
        System.out.println("ENTER CASH:");
        h =input.nextDouble();
        System.out.println("YOUR CASH IS: "+h);
        if(h>=total){
           System.out.println("YOUR CHANGE IS: "+(h-total));
        }else{
            System.out.println("YOUR TOTAL BALANCE: "+(total-h));
            System.out.println("THANK YOU FOR PURCHASING. DRIVE SAFE!" );
        }
       
        do {
            System.out.println("ENTER: 'yes' IF YOU WANT TO DO ANOTHER TRANSACTION AND 'no' IF YOU WANT TO STOP");
            String l = input.next();
            double totals=0;
           
        if (l.equals("yes")) {
               
        do {      
            int FM = 350;
            int HC = 387;
            int JP = 339;
            int MS = 479;
            int LC = 573;
            int PC = 728;
            int GT = 1250;
                   
        double N;
        double currentTotal = 0;
                   total=0;
                 System.out.println("Car Model:\n"
                      + "TYPE: 'FM' for Ford Mustang ................350\n"
                      + "TYPE: 'HC' for Honda Civic .................387\n"
                      + "TYPE: 'JP' for Jeep Wrangler ...............339\n"
                      + "TYPE: 'MS' for BMW M Series ................479\n"
                      + "TYPE: 'LC' for Land Cruiser ................573\n"
                      + "TYPE: 'PC' for Porche 911 Carrera S.........728\n"
                      + "TYPE: 'GT' for Nissan GT-R .................1250");
                    System.out.println("SELECT YOUR DESIRE CARS:");
                    String select = input.next();

                    if (select.equalsIgnoreCase("FM")) {
                        System.out.println("YOU SELECTED FORD MUSTANG");
                        System.out.println("ENTER QUANTITY");
                        N = input.nextDouble();
                        currentTotal = FM * N;
                    } else if (select.equalsIgnoreCase("HC")) {
                        System.out.println("YOU SELECTED HONDA CIVIC TYPE R");
                        System.out.println("ENTER QUANTITY");
                        N = input.nextDouble();
                        currentTotal = HC * N;
                    } else if (select.equalsIgnoreCase("JP")) {
                        System.out.println("YOU SELECTED JEEP WRANGLER");
                        System.out.println("ENTER QUANTITY");
                        N = input.nextDouble();
                        currentTotal = JP * N;
                    } else if (select.equalsIgnoreCase("MS")) {
                        System.out.println("YOU SELECTED BMW M SERIES");
                        System.out.println("ENTER QUANTITY");
                        N = input.nextDouble();
                        currentTotal = MS * N;
                    } else if (select.equalsIgnoreCase("LC")) {
                        System.out.println("YOU SELECTED LAND CRUISER");
                        System.out.println("ENTER QUANTITY");
                        N = input.nextDouble();
                        currentTotal = LC * N;
                    } else if (select.equalsIgnoreCase("PC")){
                        System.out.println("YOU SELECTED PORCHE 911 CARRERA S");
                        System.out.println("ENTER QUANTITY");
                        N = input.nextDouble();
                    } else if (select.equalsIgnoreCase("GT")) {
                        System.out.println("YOU SELECT NISSAN GT-R:" ) ;
                         System.out.println(" ENTER QUANTITY");
                        N=input.nextDouble();
                    }
                   
                    else {
                        System.out.println("!NOT VALID!");
                     }

                    totals += currentTotal;  
                    System.out.println("YOUR CURRENT TOTAL BILLS: " + totals);
                   
                   
                    System.out.print("ENTER: 'yes' IF YOU WANT TO BUY AGAIN AND 'no IF YOU WANT TO STOP ");
                    again=input.next();
                   
                } while (again.equalsIgnoreCase("yes"));

                System.out.println("ENTER CASH:");
                double v = input.nextDouble();
                System.out.println("YOUR CASH IS: " + v);

                if (v >= totals) {
                    System.out.println("YOUR CHANGE IS: " + (v - totals));
                } else {
                    System.out.println("NOT ENOUGH PAYMENT. YOU STILL OWE: " + (totals - v));
                }
               
                } else if (l.equals("no")) {
                System.out.println("STOP TRANSACTION");
                break;
            } else {
                System.out.println("!INVALID INPUT!");
            }
        } while(true);
    }
}
