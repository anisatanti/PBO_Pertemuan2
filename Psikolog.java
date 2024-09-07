/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author LENOVO
 */
public class Psikolog extends TenagaMedis implements Konsultasi, PemberianObat {
    private String Spesialisasi;
    
    public Psikolog(){
        System.out.println("ini constructor Psikolog");
        super.melakukanPemeriksaan();
        super.menyembuhkanPasien();
        super.setNama("Anisa");
        super.setUmur(25);
        this.setSpesialisasi("Psikolog Forensik");
    
}
    public void setSpesialisasi(String spesialisasi){
        this.Spesialisasi = spesialisasi;
    }
    public String getSpesialisasi(){
        return Spesialisasi;
    }

    @Override
    public void melakukanKonsultasi() {
      System.out.println("Psikolog memberikan konsultasi dengan pasien");
    }

    @Override
    public void memberiObat() {
     System.out.println("Psikolog memberi obat");
    }
    
}
