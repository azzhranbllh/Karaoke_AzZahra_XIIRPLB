/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karokesyariah_azzahranabillah_xiirplb;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM01-RPL09
 */
public class KarokeSyariah_AzZahraNabillah_XIIRPLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String azzahra_nama = null;
        int azzahra_room, azzahra_jam = 0, azzahra_total;
        double azzahra_diskon = 0.0, azzahra_kalijam = 0, azzahra_bayar = 0;        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Karaoke Syari'ah\n");
        System.out.println("List Harga: ");
        System.out.println("1.Room Small Rp.55.000");
        System.out.println("2.Room Medium Rp.70.000"); 
        System.out.println("3.Room Large Rp.120.000");
        System.out.println("4.Family Room Rp.150.000");
        
        System.out.println("Pilih Room : ");
        azzahra_room = sc.nextInt();
        if(azzahra_room == 1){
            System.out.println("Memilih Room Small");
            System.out.println("Masukkan Nama Anda: ");
            azzahra_nama = sc.next();
            System.out.println("Berapa jam Anda booking: ");
            azzahra_jam = sc.nextInt();
            if(azzahra_jam > 3) {
                System.out.println("Anda mendapatkan diskon 11.11%");
                azzahra_kalijam = 55000*azzahra_jam;
                azzahra_diskon = azzahra_kalijam*0.1111;
            } else{
                azzahra_diskon = 0;
                azzahra_kalijam = 55000*azzahra_jam;
            } 
            azzahra_bayar = azzahra_kalijam-azzahra_diskon;
            System.out.println("Harga bayar: Rp. " +azzahra_bayar);
        } else if (azzahra_room == 2){
            System.out.println("Memilih Room Medium");
            System.out.println("Masukkan Nama Anda: ");
            azzahra_nama = sc.next();
            System.out.println("Berapa jam Anda booking: ");
            azzahra_jam = sc.nextInt();
            if(azzahra_jam > 3) {
                System.out.println("Anda mendapatkan diskon 11.11%");
                azzahra_kalijam = 70000*azzahra_jam;
                azzahra_diskon = azzahra_kalijam*0.1111;
            } else{
                azzahra_diskon = 0;
                azzahra_kalijam = 70000*azzahra_jam;
            } 
            azzahra_bayar = azzahra_kalijam-azzahra_diskon;
            System.out.println("Harga bayar: Rp. " +azzahra_bayar);
        } else if(azzahra_room == 3){
            System.out.println("Memilih Room Large");
            System.out.println("Masukkan Nama Anda: ");
            azzahra_nama = sc.next();
            System.out.println("Berapa jam Anda booking: ");
            azzahra_jam = sc.nextInt();
            if(azzahra_jam > 3) {
                System.out.println("Anda mendapatkan diskon 11.11%");
                azzahra_kalijam = 120000*azzahra_jam;
                azzahra_diskon = azzahra_kalijam*0.1111;
            } else{
                azzahra_diskon = 0;
                azzahra_kalijam = 120000*azzahra_jam;
            } 
            azzahra_bayar = azzahra_kalijam-azzahra_diskon;
            System.out.println("Harga bayar: Rp. " +azzahra_bayar);
        } else if(azzahra_room == 4){
            System.out.println("Memilih Family Room");
            System.out.println("Masukkan Nama Anda: ");
            azzahra_nama = sc.next();
            System.out.println("Berapa jam Anda booking: ");
            azzahra_jam = sc.nextInt();
            if(azzahra_jam > 3) {
                System.out.println("Anda mendapatkan diskon 11.11%");
                azzahra_kalijam = 150000*azzahra_jam;
                azzahra_diskon = azzahra_kalijam*0.1111;
            } else{
                azzahra_diskon = 0;
                azzahra_kalijam = 150000*azzahra_jam;
            } 
            azzahra_bayar = azzahra_kalijam-azzahra_diskon;
            System.out.println("Harga bayar: Rp. " +azzahra_bayar);
        } 
        JOptionPane.showMessageDialog(null, "Struk Bayar" + "\nNama : " 
                +azzahra_nama+ "\nPilih Room : "+azzahra_room+ 
                "\nJam Booking : "+azzahra_jam+ " Jam" +
                "\nHarga Bayar : Rp. "+azzahra_bayar);
    }
}
