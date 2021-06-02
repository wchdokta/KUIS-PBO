/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;
import java.util.Scanner;
import kuis.Nilai.androidDevelopment;
import kuis.Nilai.webDevelopment;
/**
 *
 * @author wachid op
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        System.out.println("FORM PENDAFTARAN PT.MAJU MUNDUR\n");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("PILIH = ");
        int pilih=menu.nextInt();
        switch(pilih){
            case 1:
                android(input);
                break;
            case 2:
                web(input);
                break;
            }
        System.out.print("\n");   
}

public static void android(Scanner input) {
    String nik, nama;
    double tulis, coding, wawancara;
    boolean exit = false;
    System.out.println("\nForm Pendaftararan\n");
    System.out.print("Input NIK : ");
    nik = input.next();
    System.out.print("Input Nama : ");
    nama = input.next();
    System.out.print("Input Nilai Tes Tulis : ");
    tulis = input.nextInt();
    System.out.print("Input Nilai Tes Coding: ");
    coding = input.nextInt();
    System.out.print("Input Nilai Tes Wawancara : ");
    wawancara = input.nextInt();
        
    do{
        Scanner menu = new Scanner(System.in);
        System.out.println("\nMenu\n");
        System.out.println("1. Edit");
        System.out.println("2. Tampil");
        System.out.println("3. Exit");
        System.out.print("PILIH = ");
        int pilih=menu.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Input Nilai Tes Tulis : ");
                tulis = input.nextInt();
                System.out.print("Input Nilai Tes Coding: ");
                coding = input.nextInt();
                System.out.print("Input Nilai Tes Wawancara : ");
                wawancara = input.nextInt();
                break;
                case 2:
                androidDevelopment android = new androidDevelopment(nik,nama,tulis,coding,wawancara);
                System.out.println("total nilai: " + android.Total());
                    
                if(android.Total() >= 85){
                    System.out.print("Keterangan : LOLOS");
                    System.out.print("\nSelamat kepada " + nama + " ,anda diterima sebagai android development");
                }
                else{
                    System.out.print("Keterangan : GAGAL");
                    System.out.print("\nMohon maaf kepada " + nama + " ,anda ditolak sebagai android development");
                    }
                    break;
                case 3:
                    exit=true;
                    break;
            }
        }while(!exit); 
}
    
    
public static void web(Scanner input) {
    String nik, nama;
    double tulis, coding, wawancara;
    boolean exit = false;
    System.out.println("\nForm Pendaftararan\n");
    System.out.print("Input NIK : ");
    nik = input.next();
    System.out.print("Input Nama : ");
    nama = input.next();
    System.out.print("Input Nilai Tes Tulis : ");
    tulis = input.nextInt();
    System.out.print("Input Nilai Tes Coding: ");
    coding = input.nextInt();
    System.out.print("Input Nilai Tes Wawancara : ");
    wawancara = input.nextInt();
        
    do{
        Scanner menu = new Scanner(System.in);
        System.out.println("\nMenu\n");
        System.out.println("1. Edit");
        System.out.println("2. Tampil");
        System.out.println("3. Exit");
        System.out.print("PILIH = ");
        int pilih=menu.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Input Nilai Tes Tulis : ");
                tulis = input.nextInt();
                System.out.print("Input Nilai Tes Coding: ");
                coding = input.nextInt();
                System.out.print("Input Nilai Tes Wawancara : ");
                wawancara = input.nextInt();
                break;
                case 2:
                webDevelopment web = new webDevelopment(nik,nama,tulis,coding,wawancara);
                System.out.println("total nilai: " + web.Total());
                    
                if(web.Total() >= 85){
                    System.out.print("Keterangan : LOLOS");
                    System.out.print("\nSelamat kepada " + nama + " ,anda diterima sebagai web development");
                }
                else{
                    System.out.print("Keterangan : GAGAL");
                    System.out.print("\nMohon maaf kepada " + nama + " ,anda ditolak sebagai web development");
                    }
                    break;
                case 3:
                    exit=true;
                    break;
            }
        }while(!exit); 
    
    }
    
}