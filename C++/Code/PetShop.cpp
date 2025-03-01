#include <iostream>
#include <string>
using namespace std;

class PetShop
{
    //Private Properties
    private:
        string id;
        string nama_produk;
        int harga_produk;
        int stok_produk;

    //Public Methods
    public:

        //Constructor
        PetShop()
        {
        }

        PetShop(string id, string nama_produk, int harga_produk, int stok_produk)
        {
            this->id = id;
            this->nama_produk = nama_produk;
            this->stok_produk = stok_produk;
            this->harga_produk = harga_produk;
        }

        //Accessor
        void reset() //Untuk reset isi object (guna untuk delete)
        {
            this->id = "";
            this->nama_produk = "";
            this->stok_produk = 0;
            this->harga_produk = 0;
        }

        string getID() //untuk mendapatkan ID dalam object
        {
            return this->id;
        }

        string getnamaProduk() //untuk mendapatkan nama dalam object
        {
            return this->nama_produk;
        }

        int getstokProduk() //untuk mendapatkan stok dalam object
        {
            return this->stok_produk;
        }

        int gethargaProduk() //untuk mendapatkan harga dalam object
        {
            return this->harga_produk;
        }

        //Destructor
        ~PetShop()
        {
        }
};