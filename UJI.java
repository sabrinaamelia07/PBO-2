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
public class UJI {
    public static void main(String[] args){
        PRAKTIKUM BIS = new PRAKTIKUM (50);
        
        BIS.getPenumpang(24);
        BIS.cetakPenumpang();
        
        //penambahan penumpang
        BIS.getPenumpang(10);
        BIS.cetakPenumpang();
        
        //penambahan penumpang
        BIS.getPenumpang(24);
        BIS.cetakPenumpang();
        
        //penambahan penumpang
        BIS.getPenumpang(10);
        BIS.cetakPenumpang();
        
        //penambahan penumpang
        BIS.getPenumpang(24);
        BIS.cetakPenumpang();
        
        System.out.println("rata-rata berat penumpang sekarang adalah : " + BIS.getAverage());
        
        
    }
    
}
