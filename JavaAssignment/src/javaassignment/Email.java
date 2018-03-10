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
           throw InvalidAddress("input error");
       }
       else{
           System.out.println("Sucessfull...");
       }
    }

    private  static Exception InvalidAddress(String input_error) throws Exception {
        throw new Exception("Invalid Address"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
