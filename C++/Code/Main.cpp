#include <iostream>
#include <string>
#include <cmath>
#include "Baju.cpp"

using namespace std;

int main () {
    Baju data_baju[51];
    data_baju[0] = Baju("A001", "Kalung_Kucing_Berlian", 50000, 15, "Kalung", "Kulit_Sintetis", "Merah", "Kucing", "M", "MeowStyle");
    data_baju[1] = Baju("A002", "Gelang_Kaki_Anjing", 30000, 20, "Gelang", "Karet", "Biru", "Anjing", "L", "PawCharm");
    data_baju[2] = Baju("A003", "Topi_Kucing_Fashion", 45000, 10, "Topi", "Katun", "Hitam", "Kucing", "S", "FurryFashion");
    data_baju[3] = Baju("A004", "Dasi_Anjing_Formal", 40000, 8, "Dasi", "Satin", "Coklat", "Anjing", "M", "DogStyle");
    data_baju[4] = Baju("A005", "Bandana_Kelinci_Polkadot", 35000, 12, "Bandana", "Katun", "Pink", "Kelinci", "S", "BunnyTrend");

    int stop = 0, n = 5;
    int input;
    while (stop == 0) {
        cout << "===========================================" << "\n";
        cout << "       Welcome to Nipqt PetShop V2.0       " << "\n";
        cout << "-------------------------------------------" << "\n";
        cout << "1 | Add                                    " << "\n";
        cout << "2 | Show                                   " << "\n";
        cout << "0 | Exit                                   " << "\n";
        cout << "===========================================" << "\n";
        cout << "\n";
        cout << "Pilih Opsi : "; cin >> input;

        switch (input)
        {
        case 1:
        {
            int addstop = 0, error, next = 0;
            string id, nama_produk, jenis, bahan, warna, untuk, size, merk;
            int harga_produk, stok_produk; 
            while (addstop == 0) {
                cout << "ID ('end' untuk mengakhiri) : "; cin >> id;
                if (id == "end") {
                    addstop = 1;
                } else {
                    next = 1;
                    error = 0;
                    int i = 0;
                    while ((error == 0) && (i < n)) {
                        if (data_baju[i].getID() == id) {
                            cout << "ERROR : ID (" + id + ") sama" << "\n";
                            error = 1;
                        } else {
                            i++;
                        }
                    }
                    if (error == 0) {
                        cout << "Nama Produk                 : "; cin >> nama_produk;
                        cout << "Harga Produk                : "; cin >> harga_produk;
                        cout << "Stok Produk                 : "; cin >> stok_produk;
                        cout << "Jenis                       : "; cin >> jenis;
                        cout << "Bahan                       : "; cin >> bahan;
                        cout << "Warna                       : "; cin >> warna;
                        cout << "Untuk                       : "; cin >> untuk;
                        cout << "Size                        : "; cin >> size;
                        cout << "Merk                        : "; cin >> merk;
                        data_baju[i] = Baju(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk);
                        n++;
                    }
                }
            }
            if ((next == 1) && (error == 0)) {
                cout << "Data Has Been Added" << "\n";
            }
            cout << "\n";
            break;
        }
        case 2:
        {
            int digitHarga = 8, digitStok = 7, panjangId = 5, panjangNama = 14, panjangJenis = 8, panjangBahan = 8, panjangWarna = 8, panjangUntuk = 8, panjangSize = 7, panjangMerk = 7; 
            for (int i = 0; i < n; i++) {
                if (data_baju[i].getID().length() + 3 >= panjangId) {
                    panjangId = data_baju[i].getID().length() + 3;
                }
                if (data_baju[i].getnamaProduk().length() + 3 >= panjangNama) {
                    panjangNama = data_baju[i].getnamaProduk().length() + 3;
                }
                if (floor(log10(abs(data_baju[i].gethargaProduk())) + 1) + 3 >= digitHarga) {
                    digitHarga = floor(log10(abs(data_baju[i].gethargaProduk())) + 1) + 3;
                }
                if (floor(log10(abs(data_baju[i].getstokProduk())) + 1) + 3 >= digitStok) {
                    digitStok = floor(log10(abs(data_baju[i].getstokProduk())) + 1) + 3;
                }
                if (data_baju[i].getJenis().length() + 3 >= panjangJenis) {
                    panjangJenis = data_baju[i].getJenis().length() + 3;
                }
                if (data_baju[i].getBahan().length() + 3 >= panjangBahan) {
                    panjangBahan = data_baju[i].getBahan().length() + 3;
                }
                if (data_baju[i].getWarna().length() + 3 >= panjangWarna) {
                    panjangWarna = data_baju[i].getWarna().length() + 3;
                }
                if (data_baju[i].getUntuk().length() + 3 >= panjangUntuk) {
                    panjangUntuk = data_baju[i].getUntuk().length() + 3;
                }
                if (data_baju[i].getSize().length() + 3 >= panjangSize) {
                    panjangSize = data_baju[i].getSize().length() + 3;
                }
                if (data_baju[i].getMerk().length() + 3 >= panjangMerk) {
                    panjangMerk = data_baju[i].getMerk().length() + 3;
                }
            }

            cout << "+";
            for (int i = 0; i < (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk) - 1; i++) {
                cout << "-";
            }
            cout << "+" << "\n";

            cout << "| ID";
            for (int i = 0; i < (panjangId-4); i++) {
                cout << " ";
            }
            cout << "| Nama Produk";
            for (int i = 0; i < (panjangNama-13); i++) {
                cout << " ";
            }
            cout << "| Harga";
            for (int i = 0; i < (digitHarga-7); i++) {
                cout << " ";
            }
            cout << "| Stok";
            for (int i = 0; i < (digitStok-6); i++) {
                cout << " ";
            }
            cout << "| Jenis";
            for (int i = 0; i < (panjangJenis-7); i++) {
                cout << " ";
            }
            cout << "| Bahan";
            for (int i = 0; i < (panjangBahan-7); i++) {
                cout << " ";
            }
            cout << "| Warna";
            for (int i = 0; i < (panjangWarna-7); i++) {
                cout << " ";
            }
            cout << "| Untuk";
            for (int i = 0; i < (panjangUntuk-7); i++) {
                cout << " ";
            }
            cout << "| Size";
            for (int i = 0; i < (panjangSize-6); i++) {
                cout << " ";
            }
            cout << "| Merk";
            for (int i = 0; i < (panjangMerk-6); i++) {
                cout << " ";
            }
            cout << "|" << "\n";

            cout << "+";
            for (int i = 0; i < (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk) - 1; i++) {
                cout << "-";
            }
            cout << "+" << "\n";

            for (int i = 0; i < n; i++) {
                cout << "| " + data_baju[i].getID();
                int spasi = (panjangId-2) - data_baju[i].getID().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " + data_baju[i].getnamaProduk();
                spasi = (panjangNama-2) - data_baju[i].getnamaProduk().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].gethargaProduk();
                spasi = (digitHarga-2) - floor(log10(abs(data_baju[i].gethargaProduk())) + 1);
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].getstokProduk();
                spasi = (digitStok-2) - floor(log10(abs(data_baju[i].getstokProduk())) + 1);
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].getJenis();
                spasi = (panjangJenis-2) - data_baju[i].getJenis().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].getBahan();
                spasi = (panjangBahan-2) - data_baju[i].getBahan().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].getWarna();
                spasi = (panjangWarna-2) - data_baju[i].getWarna().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].getUntuk();
                spasi = (panjangUntuk-2) - data_baju[i].getUntuk().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].getSize();
                spasi = (panjangSize-2) - data_baju[i].getSize().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "| " << data_baju[i].getMerk();
                spasi = (panjangMerk-2) - data_baju[i].getMerk().length();
                for (int j = 0; j < spasi; j++) {
                    cout << " ";
                }
                cout << "|";
                cout << "\n";
            }

            cout << "+";
            for (int i = 0; i < (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk) - 1; i++) {
                cout << "-";
            }
            cout << "+" << "\n";
            cout << "\n";
            break;
        }
        case 0:
        {
            cout << "============================================" << "\n";
            cout << "         Thank For Your Checking In         " << "\n";
            cout << "           Have A Nice Day Dawgg!           " << "\n";
            cout << "============================================" << "\n";
            stop = 1;
            break;
        }
        default:
            cout << "ERROR : Command yang dimasukkan tidak tersedia" << "\n";
        }
    }
    return 0;
}