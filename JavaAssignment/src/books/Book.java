/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author Dell
 */
public class Book {
  //  BookId, AccessionNumber, BookName, Author, Publication
    public int BookId;
    public int AccessionNumber;
    public String BookName;
   public  String Author;
    public String Publication;
    public Book(int id,int accno,String name,String auth,String pub){
        BookId=id;
        AccessionNumber=accno;
        BookName=name;
        Author=auth;
        Publication=pub;
    }
    public void printall(){
        System.out.println("Book id:"+BookId);
        System.out.println("Accession no:"+AccessionNumber);
        System.out.println("Book Name:"+BookName);
        System.out.println("Author:"+Author);
        System.out.println("Publication:"+Publication);
        
    }
    
}
