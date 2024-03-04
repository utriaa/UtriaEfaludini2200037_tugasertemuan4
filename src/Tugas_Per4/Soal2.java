/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Per4;

/**
 *
 * @author UTRIA
 */
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = masukan.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = masukan.nextInt();
        
        int jumlahGanjil = 0;
        

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) { 
                jumlahGanjil++; 
            }
        }
        

        System.out.println("Banyaknya bilangan ganjil: " + jumlahGanjil);
    }
}
