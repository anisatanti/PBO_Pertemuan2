Ini adalah project java yang berisi Constructor, Super, This, Casting, dan Interface.

Terdapat 2 kelas Interface yakni kelas Konsultasi dan kelas Pemberian obat.
Kelas Tenaga Medis sebagai kelas induk yang methodnya akan diturunkan kedalam kelas Psikolog dan kelas Apoteker.
Kelas Psikolog meng-ekstends kelas Tenaga Medis dan meng-implements kelas interface Konsultai dan kelas Pemberian Obat.
Kelas Apoteker meng-ekstends kelas Tenaga Medis dan meng-implements kelas interface Konsultai dan kelas Pemberian Obat.
Kelas Utama sebagai main class berisi pemanggilan Constructor, Super, This, dan Casting.

this berfungsi memanggil method pada kelas yang dipanggil (Psikolog dan Apoteker) sedangkan super berfungsi memanggil method pada kelas induk (Tenaga Medis)
