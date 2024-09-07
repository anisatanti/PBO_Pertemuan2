/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author LENOVO
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Psikolog psi = new Psikolog(); // Constructor
        System.out.println("Nama psikolog: " + psi.getNama());
        System.out.println("Umur psikolog: " + psi.getUmur ());
        System.out.println("Spesialisasi psikolog: " + psi.getSpesialisasi());
        System.out.println("");
        
        Apoteker apt = new Apoteker(); //constructor
        System.out.println("Nama apoteker: " + apt.getNama());
        System.out.println("Umur apoteker: " + apt.getUmur());
        System.out.println("Apoteker bekerja di " + apt.gettempatKerja());
        System.out.println("");
        System.out.println("penggunaan Super and This");
        apt.cek();
        System.out.println("");
        
        TenagaMedis nakes = (TenagaMedis) psi; // Casting 
        nakes.melakukanPemeriksaan();
        nakes.menyembuhkanPasien();
        System.out.println("");
        
        Apoteker Aptklinis = new Apoteker(); // Interface 
        Aptklinis.melakukanKonsultasi();
        Aptklinis.memberiObat();


    }
    
}







