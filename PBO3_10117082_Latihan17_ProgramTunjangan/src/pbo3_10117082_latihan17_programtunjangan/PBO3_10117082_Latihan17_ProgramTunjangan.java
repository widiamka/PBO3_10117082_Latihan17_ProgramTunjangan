/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan17_programtunjangan;

import java.util.Scanner;

/**
 *
* Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan tunjangan
* dari gaji
 */
public class PBO3_10117082_Latihan17_ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     double gajiPokok,tunjangan,totalGaji;
     String status;
       
      
      
      
      
      Scanner scn = new Scanner(System.in);
        System.out.println("========Program Tunjangan========");
        System.out.println("Berapa Gaji Pokok Anda Perbulan?\t: ");
        gajiPokok = scn.nextDouble();
        
        System.out.println("Status Anda? (Menikah/Belum)\t:");
        status = scn.next();
        
        tunjangan =(status.equals("Menikah")?0.35*gajiPokok:0);
        totalGaji = gajiPokok+tunjangan;
        
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t:"+gajiPokok);
        
        System.out.println("Tunjangan\t:"+tunjangan);
       
        System.out.println("Total Gaji\t:"+totalGaji);
    
    }
    
}
