/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankedua;

/**
 *
 * @author LENOVO
 */
public class Apoteker extends TenagaMedis implements Konsultasi, PemberianObat {
    
    private String tempatKerja;
    
    public Apoteker(){
        System.out.println("ini constructor Apoteker");
        super.melakukanPemeriksaan();
        super.menyembuhkanPasien();
        super.setNama("Sania");
        super.setUmur(22);
        this.settempatKerja("Apotek");
    } 
       public void settempatKerja(String tempat){
       this.tempatKerja = tempat;
   }
       public String gettempatKerja(){
           return tempatKerja;
       }

    @Override
    public void melakukanKonsultasi() {
        System.out.println("Apoteker memberikan konsultasi terkait penggunaan obat.");
   }

    @Override
    public void memberiObat() {
        System.out.println("Apoteker memberikan obat");
    }
    
    public void cek(){
        super.melakukanKonsultasi();
        this.melakukanKonsultasi();
        super.memberiObat();
        this.memberiObat();
        
    }
    
}
