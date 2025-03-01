#include <iostream>
#include <string>
#include "Aksesoris.cpp"
using namespace std;

class Baju : public Aksesoris
{
private:
    string untuk;
    string size;
    string merk;

public:
    Baju() {
        
    }

    Baju(string id, string nama_produk, int harga_produk, int stok_produk, string jenis, string bahan, string warna, string untuk, string size, string merk) : Aksesoris(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna) {
        this->untuk = untuk;
        this->size = size;
        this->merk = merk;
    }

    string getUntuk() {
        return this->untuk;
    }

    string getSize() {
        return this->size;
    }

    string getMerk() {
        return this->merk;
    }

    ~Baju(){

    }
};