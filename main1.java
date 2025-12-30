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
