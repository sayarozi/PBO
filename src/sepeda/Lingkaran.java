/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepeda;

/**
 *
 * @author ROZI
 */
        //rumus luas lingkarang = phi*r*r
        //rumus keliling lingkarang = 2*phi*r
public class Lingkaran extends BangunDatar{
    float r;
    float phi=3.141592f;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return phi*r*r;
    }

    @Override
    public float keliling() {
        return 2*phi*r;
    }
     
}
