/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan25.ejaannama;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA : Gandy Christian Situmorang
 * KELAS: PBO-6
 * NIM  : 10116228
 * Deskripsi Program : Program ini berisi program yang menampilkan ejaan nama
 */
public class PBO610116228Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama depan untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk " + Nama + " adalah : ");
        
        for (int i = 0; i < Panjang; i++){
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
    }
    
}
