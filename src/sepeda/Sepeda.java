/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sepeda;

/**
 *
 * @author ROZI
 */
public class Sepeda {
    String merk;
    int kecepatan, gear;

    public Sepeda(String merk, int kecepatan, int gear) {
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.gear = gear;
    }
    
    public int tambahKecepatan(int increment){
        kecepatan += increment;
        return kecepatan;
    }

    public int kurangKecepatan(int decrement){
        kecepatan -= decrement;
        return kecepatan;
    }
    public void info(){
        System.out.println("Merek : " + merk);
        System.out.println("Kecepatan : " + kecepatan);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang pp = new PersegiPanjang(5,3);
        System.out.println("Luas persegi panjang = " + pp.luas());
        System.out.println("Keliling persegi panjang = " + pp.keliling());
        
        //rumus luas lingkarang = phi*r*r
        //rumus keliling lingkarang = 2*phi*r
        Lingkaran l = new Lingkaran(5);
        System.out.println("Luas lingkaran = " + l.luas());
        System.out.println("Keliling lingkaran = " + l.keliling());
        
        //rumus luas segitiga = 0.5*alas*tinggi
        //rumus keliling segitiga = a+b+c
        //rumus keliling segitiga sama sisi = 3*alas
        Segitiga s = new Segitiga(5,3);
        System.out.println("Luas segitiga = " + s.luas());
        System.out.println("Keliling segitiga = " + s.keliling());
    }
    
}
