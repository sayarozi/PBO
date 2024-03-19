/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepeda;

/**
 *
 * @author ROZI
 */
public class Tv {
    String merek, ukuranLayar;
    int channel, volume;

    public Tv(String merek, String ukuranLayar, int channel, int volume) {
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
        this.channel = channel;
        this.volume = volume;
    }
    public boolean nyalakan(boolean nyala){
        return nyala == true;
    }
    
    public boolean matikan(boolean nyala){
        return nyala == false;
    }
    public void info(){
        System.out.println("Merek TV = "+merek);
        System.out.println("Ukuran Layar = "+ukuranLayar);
        System.out.println("Channel = "+channel);
        System.out.println("Volume = "+volume);
    }
    public static void main(String[] args) {
        Tv tv1 = new Tv("Politron", "24", 2, 11);
        tv1.info();
    }
}