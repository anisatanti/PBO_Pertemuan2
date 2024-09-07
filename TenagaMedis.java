/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author LENOVO
 */
public class TenagaMedis {
    
 private String nama;
 private int umur;
    
    public void melakukanPemeriksaan() {
        System.out.println("Tenaga Medis melakukan pemeriksaan kesehatan pasien");
    }
    public void menyembuhkanPasien(){
        System.out.println("Tenaga Medis berupaya menyembuhkan pasien");   
    }
    public void spesialisasi(){
        System.out.println("Tenaga Medis memiliki spesialisasi");
    }
    public void tempatKerja(){
        System.out.println("Tenaga Medis bekerja di Rumah Sakit");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        return umur;
    }
    public void melakukanKonsultasi() {
        System.out.println("Tenaga Medis melakukan konsultasi terhadap pasien");
   }

    public void memberiObat() {
        System.out.println("Tenaga medis memberi obat kepada pasien");
          }
}
