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
public class Anggrek {
    public void tampilanggrek(){
        System.out.println("Ini kelas anggrek");
        Tanaman tam = new Tanaman();
        tam.setNama("Anggrek");
        System.out.println("Tanaman ini bernama  : "+tam.getNama());
        tam.setWarna("Ungu");
        System.out.println("Tanaman ini berwarna  : "+tam.getWarna());
    }
    
}
