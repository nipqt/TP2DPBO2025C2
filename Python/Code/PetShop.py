class PetShop:
    __ID = ""
    __nama_produk = ""
    __harga_produk = 0
    __stok_produk = 0

    def __init__(self, ID, nama_produk, harga_produk, stok_produk):
        self.__ID = ID
        self.__nama_produk = nama_produk
        self.__harga_produk = harga_produk
        self.__stok_produk = stok_produk

    def getID(self):
        return self.__ID
    
    def getnamaProduk(self):
        return self.__nama_produk
    
    def getstok(self):
        return self.__stok_produk
    
    def getharga(self):
        return self.__harga_produk