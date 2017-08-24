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
public class LibraryCard {
    private Student owner = new Student();
    private int borrowCnt;

    public void checkOut(int borrowCnt) {
        this.borrowCnt = borrowCnt;
    }    
    
    public int getNumberOfBooks() {
        return borrowCnt;
    }
    
    public void setOwner(Student owner) {
        this.owner = owner;
    }
    
    public String getOwnerName(){
        return this.owner.getName();
    }

    

    
    
    
}
