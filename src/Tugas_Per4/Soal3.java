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

public class Soal3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = masukan.nextInt();
        
        int faktorial = 1;
        for (int i = n; i > 0; i--) {
            faktorial *= i;
        }
        
        System.out.print(n + "! = ");
        for (int i = n; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + faktorial);
    }
}
