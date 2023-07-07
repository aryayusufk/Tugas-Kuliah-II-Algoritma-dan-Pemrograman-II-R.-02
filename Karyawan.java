/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKuliah2;

/**
 *
 * @author aryay
 */

//Nama: Arya Yusuf Karan
//NPM: 227064516066

//Membuat Parent Class Karyawan
public class Karyawan {
    String NIP;
    String nama;
    String JenisKelamin;
    int JumlahHari;
    int TotalGaji;
    
    //Membuat Method karyawan dengan parameter
    void karyawan(String NIP, String nama, String JenisKelamin){
        //Mengatur properti 'NIP' dari objek saat ini dengan nilai dari parameter 'NIP'
        this.NIP=NIP;
        //Mengatur properti 'nama' dari objek saat ini dengan nilai dari parameter 'nama'
        this.nama=nama;
        //Mengatur properti 'JenisKelamin' dari objek saat ini dengan nilai dari parameter 'JenisKelamin'
        this.JenisKelamin=JenisKelamin;
    }
    
    //Membuat Method AbsenKerja
    void AbsenKerja(){
        //Menambah jumlah data yang berada pada variabel JumlahHari dengan 1 setiap Method AbsenKerja dipanggil
        JumlahHari++;
    }
    
    //Membuat Method HitungGaji tanpa parameter
    void HitungGaji(){
        TotalGaji=JumlahHari*50000;
    }
    
    //Membuat Method HitungGaji dengan parameter
    void HitungGaji(int jumlah_hari){
        TotalGaji=jumlah_hari*50000;
    }
}

//Membuat Child Class dosen
class dosen extends Karyawan{
    String golongan;
    int jumlah_sks;
    int upah_per_sks;
    
    //Menggunakan metode Override dan membuat Method HitungGaji dengan isi yang berbeda untuk Class dosen
    @Override
    void HitungGaji(){
        TotalGaji=upah_per_sks*jumlah_sks*JumlahHari;
    }
}

//Membuat Child Class staff
class staff extends Karyawan{
    
}
