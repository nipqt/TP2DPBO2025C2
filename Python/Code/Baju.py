from Aksesoris import Aksesoris

class Baju (Aksesoris) :
    __untuk = ""
    __size = ""
    __merk = ""

    def __init__(self, ID, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk):
        super().__init__(ID, nama_produk, harga_produk, stok_produk, jenis, bahan, warna)
        self.__untuk = untuk
        self.__size = size
        self.__merk = merk

    def getUntuk(self) :
        return self.__untuk
    
    def getSize(self) :
        return self.__size
    
    def getMerk(self) :
        return self.__merk