# Janji

Saya Hanif Ahmad Syauqi dengan NIM 2304330 mengerjakan soal Tugas Praktikum 2 dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Desain Program

Di Program ini terdiri dari beberapa class :
- Class PetShop (Kelas Utama) :
    - Atribut:
        - id (Kode Indentitas Produk)
        - nama_produk (Nama Produk)
        - harga_produk (Harga Produk)
        - stok_produk (Stok Produk)
        - gambar (Gambar Produk) (di PHP)
    - Metode:
        - getID (untuk mendapatkan atribut id)
        - getnamaProduk (untuk mendapatkan atribut nama_produk)
        - getharga (untuk mendapatkan atribut harga_produk)
        - getstok (untuk mendapatkan atribut stok_produk)
        - getgambar (untuk mendapatkan atribut gambar) (di PHP)

- Class Aksesoris (Anak dari PetShop) :
    - Atribut:
        - jenis (Jenis Produk)
        - bahan (Bahan dalam Produk)
        - warna (Warna Produk)
    - Metode:
        - getJenis (untuk mendapatkan atribut jenis)
        - getBahan (untuk mendapatkan atribut bahan)
        - getWarna (untuk mendapatkan atribut warna)

- Class Baju (Anak dari Aksesoris) :
    - Atribut:
        - untuk (Untuk hewan apa Produknya)
        - size (Ukuran Produk)
        - merk (Merk Produk)
    - Metode:
        - getUntuk (untuk mendapatkan atribut untuk)
        - getSize (untuk mendapatkan atribut size)
        - getMerk (untuk mendapatkan atribut merk)

Jika digambarkan dalam grafik, maka akan menjadi seperti berikut:
![Image](https://github.com/user-attachments/assets/a37266b8-b6f9-489b-a89a-a569f7c90d1f)

# Alur Program

- Di awal program akan disambut dengan "Welcome To Nipqt PetShop V2.0"
- Di dalam program, terdapat beberapa pilihan :
    - 1 -> Add (menambah data)
    - 2 -> Show (menampilkan data)
    - 0 -> Exit (keluar dari Program) (reset dalam PHP)
- Terdapat 5 default data yang sudah ada di dalam Program
- Terdapat "id case sensitive" yang dimana jika user memasukkan data yang sudah tersedia di dalam data, maka akan muncul error
- Jika memilih Exit, maka sebelum program berakhir, akan muncul pesan Terima Kasih dari Program

# Dokumentasi

### Dokumentasi C++
![Dokum C++](https://github.com/nipqt/TP2DPBO2025C2/blob/main/C++/Dokumentasi/1.jpeg)
![Dokum C++](https://github.com/nipqt/TP2DPBO2025C2/blob/main/C++/Dokumentasi/2.jpeg)
![Dokum C++](https://github.com/nipqt/TP2DPBO2025C2/blob/main/C++/Dokumentasi/3.jpeg)

### Dokumentasi Java
![Dokum Java](https://github.com/nipqt/TP2DPBO2025C2/blob/main/Java/Dokumentasi/1.jpeg)
![Dokum Java](https://github.com/nipqt/TP2DPBO2025C2/blob/main/Java/Dokumentasi/2.jpeg)
![Dokum Java](https://github.com/nipqt/TP2DPBO2025C2/blob/main/Java/Dokumentasi/3.jpeg)

### Dokumentasi Python
![Dokum Python](https://github.com/nipqt/TP2DPBO2025C2/blob/main/Python/Dokumentasi/1.jpeg)
![Dokum Python](https://github.com/nipqt/TP2DPBO2025C2/blob/main/Python/Dokumentasi/2.jpeg)
![Dokum Python](https://github.com/nipqt/TP2DPBO2025C2/blob/main/Python/Dokumentasi/3.jpeg)

### Dokumentasi PHP
![Dokum PHP](https://github.com/nipqt/TP2DPBO2025C2/blob/main/PHP/Dokumentasi/1.jpeg)
![Dokum PHP](https://github.com/nipqt/TP2DPBO2025C2/blob/main/PHP/Dokumentasi/2.jpeg)
