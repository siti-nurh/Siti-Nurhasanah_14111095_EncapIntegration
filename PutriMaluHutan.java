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
public class PutriMaluHutan extends PutriMalu {
    
    public void tampilputrimalu(){
    System.out.println("Ini Kelas PutriMalu");
        Tanaman tam = new Tanaman();
        tam.setNama("PutriMalu");
        System.out.println("Tanaman ini bernama  : "+tam.getNama());
        tam.setWarna("Hijau");
        System.out.println("Tanaman ini berwarna  : "+tam.getWarna());
               
    }
    public void tampilputrimaluhutan(){
        
        System.out.println( "Ini kelas Putri malu hutan Turunan dari kelas putri malu");
    }
    @Override
    protected void printWarna(){
        System.out.println("Tanaman ini berwarna :"+super.getWarna());
    }
    @Override
    protected void printTempat(){
        System.out.println("Tanaman ini berada di tempat :"+super.getTempat());
    }
               
}
