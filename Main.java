/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author siti
 */
public class Main {
    public static void main (String [] args){
        
        Tanaman tam = new Tanaman();
            System.out.println("Ini kelas Tanaman");
    System.out.println("");
    
    
    PutriMaluHutan pt = new PutriMaluHutan ();
    pt.tampilputrimalu();
    pt.tampilputrimaluhutan();
    pt.printWarna();
    pt.printTempat();
    
   System.out.println("");
   
    Anggrek ag = new Anggrek();
    ag.tampilanggrek();
    
   }
    
}
