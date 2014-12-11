/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demobalok;

import java.text.DecimalFormat;

/**
 *
 * @author UIN
 */
public class DemoBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DecimalFormat decimalFormat;
       
       Balok balok = new Balok();
       
       decimalFormat = new DecimalFormat("0.00");
       String string = "Menggunakan Kelas Balok\n";
       
       string += "\nPanjang Balok : " + decimalFormat.format(balok.getPanjang());
       string += "\nLebar Balok : " + decimalFormat.format(balok.getLebar());
       string += "\nTinggi Baloj : " + decimalFormat.format(balok.getTinggi());
       string += "\nVolume Balok : " + decimalFormat.format(balok.mencariVolumeB());
       
       string += "\nMemodifikasi panjang =5 lebar = 3";
       balok.setPanjang(5);
       balok.setLebar(3);
       string += "\nPanjang Balok : " + decimalFormat.format(balok.getPanjang());
       string += "\nLebar Balok : " + decimalFormat.format(balok.getLebar());
       string += "\nTinggi Balok : " + decimalFormat.format(balok.getTinggi());
       string += "\nVolume Balok : " + decimalFormat.format(balok.mencariVolumeB());
       
       System.out.println(string);
    }
    
}
