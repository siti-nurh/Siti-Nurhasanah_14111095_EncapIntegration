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
public abstract class PutriMalu {
    protected String warna = "Hijau";
    protected String tempat = "Didarat";
    
    protected String getWarna(){
        return warna;
    }
    protected String getTempat(){
        return tempat;
    }
    protected abstract void printWarna();
    
    protected abstract void printTempat();
}
