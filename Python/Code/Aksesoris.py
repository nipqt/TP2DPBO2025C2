from PetShop import PetShop
class Aksesoris (PetShop) :
    __jenis = ""
    __bahan = ""
    __warna = ""

    def __init__(self, ID, nama_produk, harga_produk, stok_produk, jenis, bahan, warna):
        super().__init__(ID, nama_produk, harga_produk, stok_produk)
        self.__jenis = jenis
        self.__bahan = bahan
        self.__warna = warna
    
    def getJenis(self) :
        return self.__jenis
    
    def getBahan(self) :
        return self.__bahan
    
    def getWarna(self) :
        return self.__warna