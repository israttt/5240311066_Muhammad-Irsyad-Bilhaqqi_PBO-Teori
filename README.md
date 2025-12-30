# 5240311066_Muhammad-Irsyad-Bilhaqqi_PBO-Teori
Tugas PBO Teori Overloading, Overriding, Abstrak

Nama	: Muhammad Irsyad Bilhaqqi
NPM	: 5240311066

Tugas Pemrograman Berbasis Objek
Overloading, Overriding, Abstrak

SOAL
1.	Lengkapi program di atas tanpa mengubah struktur kelas.
Full Kode Program:
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 *
 * @author irsyad
 */
import java.util.Scanner;

// ================= CLASS ABSTRAK =================
abstract class Penumpang {
    protected String nama;
    protected String noTiket;

    public Penumpang(String nama, String noTiket) {
        this.nama = nama;
        this.noTiket = noTiket;
    }

    // ABSTRAK METHOD
    public abstract double hitungHargaTiket();

    // METHOD BIASA
    public void tampilkanData() {
        System.out.println("Nama        : " + nama);
        System.out.println("No Tiket    : " + noTiket);
        System.out.println("Harga Tiket : Rp " + hitungHargaTiket());
    }

    // OVERLOADING
    public void tampilkanData(String tipe) {
        tampilkanData();
        System.out.println("Tipe        : " + tipe);
    }
}

// ================= REGULER =================
class PenumpangReguler extends Penumpang {
    public PenumpangReguler(String nama, String noTiket) {
        super(nama, noTiket);
    }

    // OVERRIDING
    @Override
    public double hitungHargaTiket() {
        return 50000;
    }
}

// ================= VIP =================
class PenumpangVIP extends Penumpang {
    public PenumpangVIP(String nama, String noTiket) {
        super(nama, noTiket);
    }

    // OVERRIDING
    @Override
    public double hitungHargaTiket() {
        return 100000;
    }
}

// ================= INPUT =================
class InputPenumpang {
    protected Scanner input = new Scanner(System.in);
}

// ================= MAIN =================
public class main1 {
    public static void main(String[] args) {

        InputPenumpang ip = new InputPenumpang();

        System.out.print("Masukkan Nama Penumpang : ");
        String nama = ip.input.nextLine();

        System.out.print("Masukkan No Tiket       : ");
        String noTiket = ip.input.nextLine();

        System.out.print("Jenis Penumpang (1.Reguler / 2.VIP): ");
        int pilihan = ip.input.nextInt();

        Penumpang p;

        if (pilihan == 1) {
            p = new PenumpangReguler(nama, noTiket);
            p.tampilkanData("Reguler");
        } else {
            p = new PenumpangVIP(nama, noTiket);
            p.tampilkanData("VIP");
        }
    }
}

2.	Terapkan:
Abstraksi pada class Penumpang : 
- abstract class Penumpang
Overriding pada method hitungHargaTiket() : 
- @Override public double hitungHargaTiket()
Overloading pada method tampilkanData() : 
- public void tampilkanData() , public void tampilkanData(String tipe)

3.	Gunakan Scanner untuk menerima input data penumpang.
- Scanner input = new Scanner(System.in);

4.	Buat class Main sendiri untuk:
Mengambil input pengguna : 
- InputPenumpang ip = new InputPenumpang();
Membuat objek Penumpang
- Penumpang p;

if (pilihan == 1) { 
    p = new PenumpangReguler(nama, noTiket);
} else {
    p = new PenumpangVIP(nama, noTiket);
}
Menampilkan data penumpang
- p.tampilkanData("Reguler"); , p.tampilkanData("VIP");

5.	Program harus dapat membedakan penumpang Reguler dan VIP.
- if (pilihan == 1) { 
    p = new PenumpangReguler(nama, noTiket);
} else {
    p = new PenumpangVIP(nama, noTiket);
}

6.	Berikan penjelasan terhadap hasil penerapan polimorfisme dan abstract pada program anda. 
- Polimorfisme : 
	Penumpang p;


Satu variabel bisa:
•	Objek Reguler
•	Objek VIP
Method yang dipanggil berbeda tergantung objeknya

Abstract:
•	Class Penumpang hanya sebagai kerangka
•	Detail harga ditentukan subclass
