/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;
import journals.*;
import books.*;
import java.util.Scanner;
/**
 *
 * @author Dell
 * 
 */
class staff{
    String name;
    Journal []journinfo;
    int nob;
    int noj;
    Book [] bookinfo;
    staff(String name){
        this.name=name;
       journinfo=new Journal[20];
        bookinfo=new Book[20];
        nob=-1;
        noj=-1;
        
        
    }
    int borrow(Journal j){
        if(noj==19)
           return 0;
        else{
            journinfo[++noj]=j;
            return 1;
       }
    }
    int borrow(Book b){
         if(nob==19)
           return 0;
       else{
            bookinfo[++nob]=b;
            return 1;
        }
    }
    void display(){
        System.out.println("Staff name:"+name);
         System.out.println("Borrowed books:");
         for(int i=0;i<=nob;i++){//  BookId, AccessionNumber, BookName, Author, Publication
             bookinfo[i].printall();
            }
         System.out.println("Borrowed Journals:");
          for(int i=0;i<=noj;i++){
              journinfo[i].printall();
          }
    }
         
    
}
class student{
    String name;
    Journal []journinfo;
    Book[] bookinfo;
    int nob;
    int noj;
    student(String name){
        this.name=name;
        journinfo=new Journal[10];
        bookinfo=new Book[10];
        nob=-1;
        noj=-1;
    }
    int borrow(Journal j){
        if(noj==9)
            return 0;
        else{
            journinfo[++noj]=j;
            return 1;
        }
    }
    int borrow(Book b){
         if(nob==9)
            return 0;
        else{
            bookinfo[++nob]=b;
            return 1;
        }
    }
    void display(){
        System.out.println("Student name:"+name);
         System.out.println("Borrowed books:");
        for(int i=0;i<=nob;i++){//  BookId, AccessionNumber, BookName, Author, Publication
             bookinfo[i].printall();
            }
         System.out.println("Borrowed Journals:");
          for(int i=0;i<=noj;i++){
              journinfo[i].printall();
          }
    }
}
public class Main {
    public static void main(String args[]){
        student s[]=new student[20];
        int tots=-1;
        int totst=-1;
        staff st[]=new staff[20];
        String ch="y";
        String name;
        int op;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Add Student 2.Add Staff 3.Borrow Book 4.Borrow Journal 5.Display student info 6.Display staff info");
           op= sc.nextInt();
            switch(op){
                case 1:tots++;
                        System.out.println("Enter the name:");
                         name= sc.next();
                    s[tots]=new student(name);
                     //System.out.println(s.length);
                    break;
                case 2:totst++;
                    System.out.println("Enter the name:");
                         name= sc.next();
                    st[totst]=new staff(name);
                    break;
                case 3:System.out.println("Enter user type(staff(then press 1)/student(then press 2):");
                        int type=sc.nextInt();
                        if(type==2){
                            System.out.println("Enter student name:");
                            String sname=sc.next();
                            int f=0;
                            for(int i=0;i<=tots;i++){
                                if(s[i].name.equals(sname)){
                                    
                                    System.out.println("Enter Bookid:");
                                    int id=sc.nextInt();
                                     //BookId, AccessionNumber, BookName, Author, Publication
                                      System.out.println("Enter AAccession number:");
                                    int accno=  sc.nextInt();
                                     System.out.println("Enter Book name:");
                                     String nameb=sc.next();
                                      System.out.println("Enter Author:");
                                     String auth=sc.next();
                                      System.out.println("Enter Publication:");
                                      String pub=sc.next();
                                      Book b=new Book(id,accno,nameb,auth,pub);
                                    if(s[i].borrow(b)==1){
                                         System.out.println("Book borrowed succesfully");
                                        
                                    }
                                    else
                                         System.out.println("Reached max book limit");
                                    f=1;
                                    break;
                                }
                                else
                                    f=0;
                                    
                                }
                            if(f==0){
                                 System.out.println("student not found");
                            }
                        }
                        else if (type==1){
                            System.out.println("Enter staff name:");
                            String sname=sc.next();
                            int f=0;
                            for(int i=0;i<=totst;i++){
                                if(st[i].name.equals(sname)){
                                    
                                    System.out.println("Enter Bookid:");
                                    int id=sc.nextInt();
                                     //BookId, AccessionNumber, BookName, Author, Publication
                                      System.out.println("Enter AAccession number:");
                                    int accno=  sc.nextInt();
                                     System.out.println("Enter Book name:");
                                     String nameb=sc.next();
                                      System.out.println("Enter Author:");
                                     String auth=sc.next();
                                      System.out.println("Enter Publication:");
                                      String pub=sc.next();
                                      Book b=new Book(id,accno,nameb,auth,pub);
                                    if(st[i].borrow(b)==1){
                                         System.out.println("Book borrowed succesfully");
                                        
                                    }
                                    else
                                         System.out.println("Reached max book limit");
                                    f=1;
                                    break;
                                }
                                else
                                    f=0;
                                    
                                }
                            if(f==0){
                                 System.out.println("staff not found");
                            }
                            
                            
                        }
                        else
                            System.out.println("invalid type");
                        break;
                case 4:System.out.println("Enter user type(staff(then press 1)/student(then press 2):");
                         type=sc.nextInt();
                          if(type==2){
                            System.out.println("Enter student name:");
                            String sname=sc.next();
                            int f=0;
                            for(int i=0;i<=tots;i++){
                                if(s[i].name.equals(sname)){
                                    
                                    System.out.println("Journal id:");
                                    int id=sc.nextInt();
                                     
                                      
                                     System.out.println("Enter Journal name:");
                                     String namej=sc.next();
                                 
                                      Journal b=new Journal(id,namej);
                                    if(s[i].borrow(b)==1){
                                         System.out.println("Journal borrowed succesfully");
                                        
                                    }
                                    else
                                         System.out.println("Reached max journal limit");
                                    f=1;
                                    break;
                                }
                                else
                                    f=0;
                                    
                                }
                            if(f==0){
                                 System.out.println("student not found");
                            }
                        }
                        else if (type==1){
                            System.out.println("Enter staff name:");
                            String sname=sc.next();
                            int f=0;
                            for(int i=0;i<=totst;i++){
                                if(st[i].name.equals(sname)){
                                    
                                     System.out.println("Journal id:");
                                    int id=sc.nextInt();
                                     System.out.println("Enter Journal name:");
                                     String namej=sc.next();
                                      Journal b=new Journal(id,namej);
                                    if(st[i].borrow(b)==1){
                                         System.out.println("Journal borrowed succesfully");
                                        
                                    }
                                    else
                                         System.out.println("Reached max journal limit");
                                    f=1;
                                    break;
                                }
                                else
                                    f=0;
                                    
                                }
                            if(f==0){
                                 System.out.println("staff not found");
                            }
                            
                            
                        }
                        else
                            System.out.println("invalid type");
                        break;
                case 5:System.out.println("Enter student name:");
                         name=sc.next();
                         int g=0;
                         System.out.println("Student details");
                         for(int i=0;i<=tots;i++){
                             if(s[i].name.equals(name)){
                                 g=1;
                                 s[i].display();
                                 break;
                             }
                             else
                                 g=0;
                         }
                         if(g==0){
                             System.out.println("Student not found");
                         }
                         break;
                case 6:System.out.println("Enter staff name:");
                         name=sc.next();
                          g=0;
                         System.out.println("Staff details");
                         for(int i=0;i<=totst;i++){
                             if(st[i].name.equals(name)){
                                 g=1;
                                 st[i].display();
                                 break;
                             }
                             else
                                 g=0;
                         }
                         if(g==0){
                             System.out.println("Staff not found");
                         }
                         break;
               
                default: System.out.println("Invalid choice");
            }//to do journal,staff
             System.out.println("Do you want to continue(y/n)");
             ch=sc.next().trim();
        }while(!"n".equals(ch));
        
    }
    
}
