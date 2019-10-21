/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN4;

/**
 *
 * @author PC
 */
public class BUSS {
    public int penumpang;
    public int maxPenumpang;
    
    public BUSS(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator 
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota");
        }else{
            this.penumpang=temp;
        }
        
    }
    public void getpenumpang(int password){
        if (password==24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
            
        }
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus Sekarang = "+penumpang);
        System.out.println("Masukkan penumpang yang seharusnya adalah = "+maxPenumpang);
    }
}
