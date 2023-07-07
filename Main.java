/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasKuliah2;

/**
 *
 * @author aryay
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nama: Arya Yusuf Karan
        //NPM: 227064516066
        
        //Membuat objek karyawan1
        Karyawan karyawan1=new Karyawan();
        
        //Mengatur atribut karyawan1
        karyawan1.karyawan("001", "Arya Yusuf Karan", "Laki-laki");
        //Memanggil Method AbsenKerja dan HitungGaji dari objek karyawan1
        karyawan1.AbsenKerja();
        karyawan1.HitungGaji();
        
        //Menampilkan informasi karyawan1 pada output
        System.out.println("Nama: "+ karyawan1.nama);
        System.out.println("NIP: "+ karyawan1.NIP);
        System.out.println("Jenis Kelamin: "+ karyawan1.JenisKelamin);
        System.out.println("Total Gaji: "+ karyawan1.TotalGaji);
        System.out.println();
        
        //Membuat objek karyawan2
        Karyawan karyawan2=new Karyawan();
        
        //Mengatur atribut karyawan2
        karyawan2.karyawan("002", "Alya Nurul Zahra", "Perempuan");
        //Memanggil Method AbsenKerja dan Method HitungGaji yang memiliki parameter dari objek karyawan2
        karyawan2.AbsenKerja();
        karyawan2.HitungGaji(25);
        
        //Menampilkan informasi karyawan2 pada output
        System.out.println("Nama: "+ karyawan2.nama);
        System.out.println("NIP: "+ karyawan2.NIP);
        System.out.println("Jenis Kelamin: "+ karyawan2.JenisKelamin);
        System.out.println("Total Gaji: "+ karyawan2.TotalGaji);
        System.out.println();
        
        //Membuat objek dosen1
        dosen dosen1=new dosen();
        
        //Mengatur atribut dosen1
        dosen1.karyawan("010", "Kim Dokja", "Laki-laki");
        //Memanggil Method AbsenKerja dan HitungGaji dari objek dosen1 serta mengisi nilai atribut golongan, jumlah_sks, dan upah_per_sks
        dosen1.AbsenKerja();
        dosen1.golongan="A";
        dosen1.jumlah_sks=30;
        dosen1.upah_per_sks=100000;
        dosen1.HitungGaji();
        
        //Menampilkan informasi dosen1 pada output
        System.out.println("Nama: "+ dosen1.nama);
        System.out.println("NIP: "+ dosen1.NIP);
        System.out.println("Jenis Kelamin: "+ dosen1.JenisKelamin);
        System.out.println("Total Gaji: "+ dosen1.TotalGaji);
        System.out.println();
        
        //Membuat objek staff1
        staff staff1=new staff();
        
        //Mengatur atribut staff1
        staff1.karyawan("100", "Oliver Aiku", "Laki-laki");
        //Memanggil Method AbsenKerja dan HitungGaji dari objek staff1
        staff1.AbsenKerja();
        staff1.HitungGaji();
        
        //Menampilkan informasi staff1 pada output
        System.out.println("Nama: "+ staff1.nama);
        System.out.println("NIP: "+ staff1.NIP);
        System.out.println("Jenis Kelamin: "+ staff1.JenisKelamin);
        System.out.println("Total Gaji: "+ staff1.TotalGaji);
        System.out.println();
        
        //Membuat objek staff2
        staff staff2=new staff();
        
        //Mengatur atribut staff2
        staff2.karyawan("200", "Yukimiya Kenyu", "Laki-laki");
        //Memanggil Method AbsenKerja dan Method HitungGaji yang memiliki parameter dari objek staff2
        staff2.AbsenKerja();
        staff2.HitungGaji(30);
        
        //Menampilkan informasi staff2 pada output
        System.out.println("Nama: "+ staff2.nama);
        System.out.println("NIP: "+ staff2.NIP);
        System.out.println("Jenis Kelamin: "+ staff2.JenisKelamin);
        System.out.println("Total Gaji: "+ staff2.TotalGaji);
        System.out.println();
    }
    
}
