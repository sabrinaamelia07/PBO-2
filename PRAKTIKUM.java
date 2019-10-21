/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T.PRAKTIKUM;

/**
 *
 * @author PC
 */
public class PRAKTIKUM {
    public double penumpang;
    public double maxPenumpang;
    public double Counter;
    
    public PRAKTIKUM (int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        }
    //method mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang + penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            Counter++;
            
        }
    }
    public void getPenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
            addPenumpang(34.5);
        
        }else{
            System.out.println("Password Salah");
        }
    }
    
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus sekarang= " + penumpang);
        System.out.println("Maksimum penumpang seharusnya adalah= " + maxPenumpang);
    }
    public double getAverage(){
        return penumpang/Counter;
    }
}
