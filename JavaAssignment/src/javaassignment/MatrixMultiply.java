/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
class odd extends Thread{
    int mat1[][],mat2[][],m,n,p,q, mat3[][];
    int c1,k1;
    odd(int mat1[][],int mat2[][],int m,int n,int p,int q){
        this.mat1=mat1;
        this.mat2=mat2;
        this.m=m;this.n=n;
        this.p=p;this.q=q;
        mat3=new int[this.m][this.q];
    }
    
     public void run(){
        
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
            mat3[i][j]=0;
            }
        }
        int y=0;
        for (int i = 0; i < m; i+=2)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    mat3[y][j] = mat3[y][j] + mat1[i][k] * mat2[k][j];
                }
            }
            y++;
            
        }
        c1=y;k1=q;
     }
}
class even extends Thread{
    int mat1[][],mat2[][],m,n,p,q, mat3[][];
    int c1,k1;
    even(int mat1[][],int mat2[][],int m,int n,int p,int q){
        this.mat1=mat1;
        this.mat2=mat2;
        this.m=m;this.n=n;
        this.p=p;this.q=q;
        mat3=new int[this.m][this.q];
    }
    
     public void run(){
        
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
            mat3[i][j]=0;
            }
        }
        int y=0;
        for (int i = 1; i < m; i+=2)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    mat3[y][j] = mat3[y][j] + mat1[i][k] * mat2[k][j];
                }
            }
            y++;
            
        }
        c1=y;k1=q;
     }
}
public class MatrixMultiply {
    public static void main(String args[]) throws InterruptedException, InputException{
    
    int count=1;
    int i=0;
    int m,n,p,q;
    Scanner s=new Scanner(System.in);
     System.out.println("Enter order of first matrix A(m,n):");
     m=s.nextInt();
      n=s.nextInt();
       System.out.println("Enter order of second matrix B(p,q):");
       p=s.nextInt();
        q=s.nextInt();
        if(n==p){
        int mat1[][]=new int[m][n];
    int mat2[][]=new int[p][q];
    System.out.println("Enter First matrix A:"); 
   for(i=0;i<m;i++){
        for(int j=0;j<n;j++){
            mat1[i][j]=s.nextInt();
            
        }
        System.out.println("");
    }
   System.out.println("Enter Second matrix B:"); 
   for(i=0;i<p;i++){
        for(int j=0;j<q;j++){
            mat2[i][j]=s.nextInt();
            
        }
        System.out.println("");
    }
   
   odd o=new odd(mat1,mat2,m,n,p,q);
   even e=new even(mat1,mat2,m,n,p,q);
   o.start();
   e.start();
   
   o.join();
   e.join();
   System.out.println(" product of odd rows:");
   for( i=0;i<o.c1;i++){
     for(int j=0;j<o.k1;j++){
         System.out.print(o.mat3[i][j]+"  ");
     }
    //System.out.println("--------------------------------------");
     System.out.println("");}
     //System.out.println("--------------------------------------");
      System.out.println("product of even rows:");
   for( i=0;i<e.c1;i++){
     for(int j=0;j<e.k1;j++){
         System.out.print(e.mat3[i][j]+"  ");
      
     }
     System.out.println("");
     // System.out.println("--------------------------------------");
    }
        }
        else{
            throw new InputException("No of columns in first matrix should be equal to no of rows in second matrix");
        }
    }

    private static class InputException extends Exception {

        public InputException(String msg) {
            System.out.println(msg);
        }
    }
   
}
