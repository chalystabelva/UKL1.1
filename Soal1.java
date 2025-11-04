/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1;

/**
 *
 * @author IDEAPAD
 */
import java.util.Scanner;
public class Soal1 {

    public static void main(String[] args) {
        System.out.println("Biaya Pengiriman Paket");
        Scanner masuk = new Scanner(System.in);
        double BiayaPengiriman, volume;
        
        System.out.println("Masukkan panjang paket: ");
        double panjang = masuk.nextDouble();
        System.out.println("Masukkan lebar paket: ");
        double lebar = masuk.nextDouble();
        System.out.println("Masukkan tinggi paket");
        double tinggi = masuk.nextDouble();
        System.out.println("Masukkan berat paket: ");
        double berat = masuk.nextDouble();
        System.out.println("Masukkan jarak pengiriman: ");
        double jarak = masuk.nextDouble();
        
        volume = panjang*lebar*tinggi;
        
        double biayaPerKg;
        if(jarak <= 10){
            biayaPerKg = 4250;
        }else{
            biayaPerKg = 6000;
        }
        
        double totalBiaya = berat*biayaPerKg;
        
        if(volume > 100) {
            totalBiaya += 50000;
        }
        
        System.out.println("===================");
        System.out.println("Volume paket: " + volume + " cm³");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);
        System.out.println("Berat paket: " + berat + " kg");
        System.out.println("Jarak pengiriman: " + jarak + " km");
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
        
    }
}
