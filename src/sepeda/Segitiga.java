/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepeda;

/**
 *
 * @author ROZI
 */
        //rumus luas segitiga = 0.5*alas*tinggi
        //rumus keliling segitiga = a+b+c
        //rumus keliling segitiga sama sisi = 3*alas
public class Segitiga extends BangunDatar {
    float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return 0.5f*alas*tinggi;
    }

    @Override
    public float keliling() {
        return 3*alas;
    }
    
}
