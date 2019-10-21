/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *
 * @author PC
 */
public class UJIBIS {
    public static void main(String[] args){
        //membuat objek bisMini dari kelas BIS
        BIS bisMini = new BIS();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke
        //dalam objek bisMini
        bisMini.penumpang = 5;
        bisMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas BIS
        bisMini.cetak();
        
        //menambahkan penumpang pada bisMini
        bisMini.penumpang = bisMini.penumpang + 5;
        //memanggil method cetak pada kelas BIS
        bisMini.cetak();
        
        //mengurangi jumlah penumpang pada bisMini
        bisMini.penumpang = bisMini.penumpang - 2;
        bisMini.cetak();
        
        //menambahkan jumlah penumpang pada bisMini
        bisMini.penumpang = bisMini.penumpang + 5;
        bisMini.cetak();
        
    }
    
}
