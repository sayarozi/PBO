/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepeda;

/**
 *
 * @author ROZI
 */
public class PersegiPanjang extends BangunDatar{
    float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang*lebar;
    }
    
    @Override
    public float keliling() {
        return 2*(panjang+lebar);
    }
    
}
