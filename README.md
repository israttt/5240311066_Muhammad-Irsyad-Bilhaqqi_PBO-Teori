# 5240311066_Muhammad-Irsyad-Bilhaqqi_PBO-Teori
Tugas PBO Teori Overloading, Overriding, Abstrak

Nama	: Muhammad Irsyad Bilhaqqi
NPM	: 5240311066

Tugas Pemrograman Berbasis Objek
Overloading, Overriding, Abstrak

SOAL
1.	Lengkapi program di atas tanpa mengubah struktur kelas.
   	full kode di main1.java
  	
2. Terapkan:
Abstraksi pada class Penumpang : 
   - abstract class Penumpang
Overriding pada method hitungHargaTiket() : 
   - @Override public double hitungHargaTiket()
Overloading pada method tampilkanData() : 
   - public void tampilkanData() , public void tampilkanData(String tipe)

3. Gunakan Scanner untuk menerima input data penumpang.
   - Scanner input = new Scanner(System.in);

4. Buat class Main sendiri untuk:
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

5. Program harus dapat membedakan penumpang Reguler dan VIP.
   - if (pilihan == 1) { 
      p = new PenumpangReguler(nama, noTiket);
   } else {
      p = new PenumpangVIP(nama, noTiket);
   }

6. Berikan penjelasan terhadap hasil penerapan polimorfisme dan abstract pada program anda. 
   - Polimorfisme : 
	  Penumpang p;

Satu variabel bisa:
   - Objek Reguler
   - Objek VIP
Method yang dipanggil berbeda tergantung objeknya

Abstract:
   - Class Penumpang hanya sebagai kerangka
   - Detail harga ditentukan subclass
