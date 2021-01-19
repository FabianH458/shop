/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabko
 */

import java.util.Scanner;
public class Shop {
    
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("                                                      ");   
    System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t           Obchod s napojmi          ");
    System.out.println("\t\t\t\t   1. Kapucino              1€");   
    System.out.println("\t\t\t\t   2. Latte                 1€");
    System.out.println("\t\t\t\t   3. Kava                  1€");
    System.out.println("\t\t\t\t   4. Horka cokolada        2€");
    System.out.println("\t\t\t\t   5. Espresso              2€");
    System.out.println("\t\t\t\t   6. zrusit                         ");
    System.out.println("\t\t\t\t+====================================+");
    }
    
    public static void order(){
    System.out.println("STLAC 1 na Kapucino , STLAC 2 na Late , Stlac 3 na Kavu  STLAC 4 na Horku cokoladu , Stlac 5 na Espresso, Stlac 6 na zrusenie");
    
    choose = input.nextInt();
    
    if(choose==1){
        System.out.println("Vybral si si Kapucino, zadaj kolko kapucin chces kupit");
        
        quantity =input.nextInt();
        total = total +(quantity*1);
        
        System.out.println("Chces este nakupovat ");
        System.out.println("/Stlac Y pre Ano/ alebo /N pre nie/ : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order(); 
        }else{
            System.out.println("Pokladna");
            System.out.println("Zadaj hotovost");
            pay = input.nextDouble();
            if(pay <=total){
                
              System.out.println("Nemas dostatok penazi , potrebuješ"+ total );
              System.out.println("A ty si zaplatil" + pay );
              System.out.println("Skus to znnova ");
              order();
              
            }else{
            System.out.println("Cena je " + total);
            total = pay-total;
            System.out.println("Vydavok je" + total);
            }
        }
    }else if(choose==2){
        System.out.println("Vybral si si Late, kolko late chces kupit");
        quantity =input.nextInt();
        total = total +(quantity*1);
        
        System.out.println("Chces este kupit ");
        System.out.println("/Stlac Y pre Ano/ alebo /N pre nie/ :");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Pokladna");
            System.out.println("Zadaj hotovost");
            pay = input.nextDouble();
            if(pay <=total){
                
                 System.out.println("Nemas dostatok penazi , potrebuješ"+ total );
              System.out.println("A ty si zaplatil" + pay );
              System.out.println("Skus to znnova ");
              order();
              
            }else{
            System.out.println(" Cena je " + total);
            total = pay-total;
            System.out.println(" Vydavok je " + total);
            System.out.println("Dakujeme za nakup");
            }
        }
      }else if(choose==3){
        System.out.println("Vybral si si kavu, kolko kav chces kupit");
        quantity =input.nextInt();
        total = total +(quantity*1);
        
        System.out.println("Chces este kupit ");
        System.out.println("/Stlac Y pre Ano/ alebo /N pre nie/ : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Pokladna");
            System.out.println("Zadaj hotovost");
            pay = input.nextDouble();
            if(pay <=total){
                
                 System.out.println("Nemas dostatok penazi , potrebuješ"+ total );
              System.out.println("A ty si zaplatil" + pay );
              System.out.println("Skus to znnova ");
              order();
              
            }else{
            System.out.println("Cena je " + total);
            total = pay-total;
            System.out.println(" Vydavok je" + total);
            System.out.println("Dakujeme za nakup");
            }
        }
            }else if(choose==4){
        System.out.println("Vybral si si Horku cokoladu, kolko Horkych cokolad chces kupit");
        quantity =input.nextInt();
        total = total +(quantity*2);
        
        System.out.println("Chces este kupit ");
        System.out.println("/Stlac Y pre Ano/ alebo /N pre nie/ :");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Pokladna");
            System.out.println("Zadaj hotovost");
            pay = input.nextDouble();
            if(pay <=total){
                
                 System.out.println("Nemas dostatok penazi , potrebuješ"+ total );
              System.out.println("A ty si zaplatil" + pay );
              System.out.println("Skus to znnova ");
              order();
              
            }else{
            System.out.println(" Cena je " + total);
            total = pay-total;
            System.out.println(" Vydavok je " + total);
            System.out.println("Dakujeme za nakup");
            }
        }
              }else if(choose==5){
        System.out.println("Vybral si si Espresso, kolko Espresso chces kupit");
        quantity =input.nextInt();
        total = total +(quantity*2);
        
        System.out.println("Chces este kupit ");
        System.out.println("/Stlac Y pre Ano/ alebo /N pre nie/ :");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();//call the method you to create 
        }else{
            System.out.println("Pokladna");
            System.out.println("Zadaj hotovost");
            pay = input.nextDouble();
            if(pay <=total){
                
                 System.out.println("Nemas dostatok penazi , potrebuješ"+ total );
              System.out.println("A ty si zaplatil" + pay );
              System.out.println("Skus to znnova ");
              order();
              
            }else{
            System.out.println(" Cena je " + total);
            total = pay-total;
            System.out.println(" Vydavok je " + total);
            System.out.println("Dakujeme za nakup");
            }
        }
        
        
    }else if(choose==6){
        System.exit(0);
    }else{
        System.out.println("Neplatny prikaz , povoleny rozsah je od 1-6");
        order();
    }
    }
    public static void main(String[] args) {
       menu();
       order();
    } 
}
