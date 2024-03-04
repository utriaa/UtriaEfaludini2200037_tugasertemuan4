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

public class Soal1 {
      public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = masukan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
