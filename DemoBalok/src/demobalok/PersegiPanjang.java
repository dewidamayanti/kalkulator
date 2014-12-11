/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demobalok;

class PersegiPanjang {
    protected double panjang = 1.0;
    protected double lebar = 1.0;
    
    PersegiPanjang(){
    }
    PersegiPanjang(double x){
        panjang = x;
    }
    PersegiPanjang(double x, double y){
        panjang = x;
        lebar = y;
    }
    double mencariLuasPP(){
        return panjang*lebar;
    }
}

