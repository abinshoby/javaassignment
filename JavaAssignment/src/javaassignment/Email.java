/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Email extends Exception {
    
    public static void main(String args[]) throws Exception{
        String email="";
        System.out.println("Enter Email Address:");
        Scanner s=new Scanner(System.in);
       email= s.next();
       if(!email.contains("@")){
           throw new InvalidAddress("Invalid Address");
       }
       else{
           System.out.println("Sucessfull...");
       }
    }

    

    private static class InvalidAddress extends Exception {

        public InvalidAddress(String input_error) {
            System.out.println(input_error);
        }
    }
    
}
