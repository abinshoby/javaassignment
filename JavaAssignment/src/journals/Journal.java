/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journals;

/**
 *
 * @author Dell
 */
public class Journal {
    //Journalid;JournalName
    public int Journalid;
    public String JournalName;
    public Journal(int id,String Name){
        Journalid=id;
        JournalName=Name;
    }
    public void printall(){
        System.out.println("Journal id:"+Journalid );
        System.out.println("Journal Name:"+JournalName);
    }
}
