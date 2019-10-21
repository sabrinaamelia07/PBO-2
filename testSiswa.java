/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN3;

/**
 *
 * @author PC
 */
public class testSiswa {
    public static void main(String[] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setNama("Sabrina");
        siswa.setUmur(16);
        siswa.setAlamat("Tulungagaung");
        
        System.out.println("Nama :"+siswa.getNama());
        System.out.println("Umur :"+siswa.getUmur());
        System.out.println("Alamat :"+siswa.getAlamat());
    }
    
}
