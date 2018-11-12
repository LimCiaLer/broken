/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdassigment;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Testing1 {
    
    public static void main(String[] args){
        
        int flower, totalPrice, monthlyCreditLimit = 20, customerType;
        
        
        Scanner scan = new Scanner(System.in);
       
        OrderMenu();
        
        flower = scan.nextInt();
        
        if(flower == 1){
            System.out.println("\nTotal price is : RM50");
        }else if(flower == 2){
            System.out.println("\nTotal price is : RM35");
        }else if(flower == 3){
            System.out.println("\nTotal price is : RM30");
        }else if(flower == 4){
            System.out.println("\nTotal price is : RM55");
        }else if(flower == 5){
            System.out.println("\nTotal price is : RM60");
        }
        
        CustomerTypeUseToBe();
        customerType = scan.nextInt();
        
        if(customerType == 1){
            System.out.println("\nTransaction success !!!");
        }else if(customerType == 2){
            System.out.println("\nTransaction deny :( ");
            System.out.println("There is a monthly credit limit for this type of customer");
            System.out.println("Monthly Credit Limit : RM" + monthlyCreditLimit);
        }
        
        
        
        //nextMove = userInput.nextInt();
        

    }
    
    public static void OrderMenu(){
        System.out.println("ORDER MENU");
        System.out.println("----------");
        
        System.out.println("1.Anemone,   RM 50");
        System.out.println("2.Aster,     RM 35");
        System.out.println("3.Rose ,     RM 30");
        System.out.println("4.Carnation, RM 55");
        System.out.println("5.Dahlia,    RM 60");
        System.out.println("\nWhich flower u want to buy : ");
    }
    
    public static void CustomerTypeUseToBe(){
        System.out.println("\nChoose the customer type u use to be");  
        System.out.println("------------------------------------"); 
        System.out.println("1. Consumer");
        System.out.println("2. Corporate Customer");
        System.out.println("Your customer type : ");
    }
    
}
