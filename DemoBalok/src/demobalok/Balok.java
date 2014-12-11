package demobalok;
public class Balok extends PersegiPanjang{
    private double tinggi =1.0;
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setPanjang(double panjang){
        this.panjang = (panjang > 1)? panjang :1;
    }
    public void setLebar(double lebar){
        this.lebar = (lebar > 1)?lebar:1;
    }
    public void setTinggi(double tinggi){
        this.tinggi = (tinggi > 1) ? tinggi :1;
    }
    public double mencariVolumeB(){
        return mencariLuasPP()*tinggi;
    }
}
