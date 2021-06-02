/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.Nilai;

/**
 *
 * @author wachid op
 */
public class webDevelopment implements menghitungNilai{
    private String nik;
    private String nama;
    private double tulis;
    private double coding;
    private double wawancara;

    public webDevelopment(String nik, String nama, double tulis, double coding, double wawancara) {
        this.nik = nik;
        this.nama = nama;
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTulis() {
        return tulis;
    }

    public void setTulis(double tulis) {
        this.tulis = tulis;
    }

    public double getCoding() {
        return coding;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public double getWawancara() {
        return wawancara;
    }

    public void setWawancara(double wawancara) {
        this.wawancara = wawancara;
    }
    
    
    @Override
    public double Total() {
    return (0.4 * tulis) + (0.35 * coding) + (0.25 * wawancara) ;}
    
    
}
