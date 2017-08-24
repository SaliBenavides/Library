/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Estudiante
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student();
        student.setName("Jon Java");
        student.setEmail("jj@javauniv.edu");
        
        LibraryCard card1 = new LibraryCard();
        card1.setOwner(student);
        card1.checkOut(3);
        LibraryCard card2 = new LibraryCard();
        card2.setOwner(student);        
        
    }
    
}
