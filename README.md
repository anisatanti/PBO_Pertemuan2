# **TUGAS TM 2 PBO (CONSTRUCTOR, INTERFACE, CASTING, SUPER, THIS)**
___
## **_Deskripsi:_**
Proyek ini merupakan tugas dari mata kuliah Pemrograman Berorientasi Objek (PBO) yang membahas penggunaan konsep dasar OOP (Object Oriented Programming) seperti konstruktor, interface, casting, dan penggunaan kata kunci super dan this. Proyek ini mengimplementasikan studi kasus tenaga medis, termasuk kelas Psikolog dan Apoteker.
___
## **Informasi Tambahan**

**Constructor**

Constructor adalah metode khusus dalam sebuah kelas yang dipanggil saat objek dari kelas tersebut dibuat. Constructor digunakan untuk menginisialisasi atribut objek. Constructor memiliki nama yang sama dengan kelasnya dan tidak memiliki tipe pengembalian.

**Interface**

Interface mendefinisikan kumpulan metode tanpa implementasi. Kelas yang mengimplementasikan interface harus menyediakan implementasi untuk semua metode yang didefinisikan dalam interface. Hal ini memungkinkan berbagai kelas untuk menggunakan metode yang sama tanpa harus memiliki hubungan langsung.

**Casting**

Casting adalah proses mengubah tipe data dari satu tipe ke tipe lainnya. Casting sering digunakan untuk mengubah tipe objek ke tipe lain, baik secara eksplisit (casting manual) maupun implisit (casting otomatis). 

**Super**

super adalah kata kunci yang digunakan untuk merujuk pada kelas induk (superclass) dari suatu objek. Dalam konteks pewarisan, super dapat digunakan untuk mengakses metode dan atribut kelas induk, terutama ketika ada metode yang di override dalam kelas anak.

**This**

this adalah kata kunci yang merujuk pada objek saat ini dalam konteks kelas. this digunakan untuk membedakan antara atribut objek dan parameter metode yang memiliki nama yang sama. this berfungsi memberi kejelasan dalam output metode yang di panggil.
___
## **Tujuan Pembelajaran**
- Memahami dan menerapkan konsep konstruktor dalam kelas.
- Menggunakan Interface untuk mendefinisikan hal-hal yang harus diimplementasikan oleh kelas.
- Mengimplementasikan casting untuk memanfaatkan pewarisan.
- Menggunakan kata kunci super dan this untuk mengakses metode dan atribut kelas induk dan kelas diri sendiri.

## **Spesifikasi proyek**
- Penentuan informasi dasar mengenai psikolog dan apoteker.
- Penggunaan konstruktor untuk inisialisasi objek.
- Implementasi Interface Konsultasi dan PemberianObat.
- Demonstrasi penggunaan metode cek() pada kelas Apoteker untuk interaksi antar metode. Menampilkan perbadaan hasil output menggunakan pemanggilan kata kunci super dan this dengan nama metode yang sama. 

## **Struktur Kelas**
- **Utama**: Kelas utama yang menjalankan aplikasi dan menampilkan informasi.
- **TenagaMedis**: Kelas dasar untuk tenaga medis dengan atribut dan metode umum.
- **Psikolog**: Kelas yang mewarisi dari TenagaMedis, mengimplementasikan interface Konsultasi dan PemberianObat.
- **Apoteker**: Kelas yang juga mewarisi dari TenagaMedis, mengimplementasikan interface Konsultasi dan PemberianObat.
- **Konsultasi**: kelas Interface untuk mendefinisikan metode konsultasi medis.
- **PemberianObat**: kelas Interface untuk mendefinisikan metode pemberian obat.

