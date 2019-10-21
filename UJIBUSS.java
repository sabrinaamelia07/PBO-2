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
public class UJIBUSS {
    public static void main(String[] abc){
        BUSS bus = new BUSS(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang (2);//tambah 2 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang (1);//tambah 1 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang (2);//tambah 2 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang (2);//tambah 2 penumpang
        bus.cetakpenumpang();
        
    }
    
}
