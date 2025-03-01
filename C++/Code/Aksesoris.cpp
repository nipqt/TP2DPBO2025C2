#include <iostream>
#include <string>
#include "PetShop.cpp"
using namespace std;

class Aksesoris : public PetShop
{
private:
    string jenis;
    string bahan;
    string warna;

public:
    Aksesoris() {

    }

    Aksesoris(string id, string nama_produk, int harga_produk, int stok_produk, string jenis, string bahan, string warna) : PetShop(id, nama_produk, harga_produk, stok_produk) {
        this->jenis = jenis;
        this->bahan = bahan;
        this->warna = warna;
    }

    string getJenis() {
        return this->jenis;
    }

    string getBahan() {
        return this->bahan;
    }

    string getWarna() {
        return this->warna;
    }

    ~Aksesoris(){

    }
};
