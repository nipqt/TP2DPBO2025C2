from Baju import Baju
import math

data_baju = [
    Baju("A001", "Kalung_Kucing_Berlian", 50000, 15, "Kalung", "Kulit_Sintetis", "Merah", "Kucing", "M", "MeowStyle"),
    Baju("A002", "Gelang_Kaki_Anjing", 30000, 20, "Gelang", "Karet", "Biru", "Anjing", "L", "PawCharm"),
    Baju("A003", "Topi_Kucing_Fashion", 45000, 10, "Topi", "Katun", "Hitam", "Kucing", "S", "FurryFashion"),
    Baju("A004", "Dasi_Anjing_Formal", 40000, 8, "Dasi", "Satin", "Coklat", "Anjing", "M", "DogStyle"),
    Baju("A005", "Bandana_Kelinci_Polkadot", 35000, 12, "Bandana", "Katun", "Pink", "Kelinci", "S", "BunnyTrend")
]

stop = 0
n = 5
while stop == 0 :
    print("===========================================")
    print("       Welcome to Nipqt PetShop V2.0       ")
    print("-------------------------------------------")
    print("1 -> Add                                   ")
    print("2 -> Show                                  ")
    print("0 -> Exit                                  ")
    print("===========================================")
    print("")
    pilihan = int(input("Pilih Opsi : "))

    if (pilihan != 0) and (pilihan > 2) :
        print("ERROR : Command yang dimasukkan tidak tersedia")
    else :
        if pilihan == 1 :
            addstop = 0
            error = 0
            next = 0
            while (addstop == 0) :
                id = input("ID ('end' untuk mengakhiri) : ")
                if id == "end" :
                    addstop = 1
                else :
                    next = 1
                    error = 0
                    i = 0
                    while ((error == 0) and (i < n)) :
                        if data_baju[i].getID() == id :
                            print("ERROR : ID (" + id + ") sama")
                            error = 1
                        else :
                            i += 1

                    if error == 0 :
                        nama_produk = input("Nama Produk                 : ")
                        harga_produk = int(input("Harga Produk                : "))
                        stok_produk = int(input("Stok Produk                 : "))
                        jenis = input("Jenis                       : ")
                        bahan = input("Bahan                       : ")
                        warna = input("Warna                       : ")
                        untuk = input("Untuk                       : ")
                        size = input("Size                        : ")
                        merk = input("Merk                        : ")
                        data_baju.append(Baju(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk))
                        n += 1
            if ((next == 1) and (error == 0)) :
                print("Data Has Been Added")
            print("")
            
        elif pilihan == 2:
            digitHarga = 8
            digitStok = 7
            panjangId = 5
            panjangNama = 14
            panjangJenis = 8
            panjangBahan = 8
            panjangWarna = 8
            panjangUntuk = 8
            panjangSize = 7
            panjangMerk = 7
            for i in range(n) :
                if len(data_baju[i].getID()) + 3 >= panjangId :
                    panjangId = len(data_baju[i].getID()) + 3
                if len(data_baju[i].getnamaProduk()) + 3 >= panjangNama :
                    panjangNama = len(data_baju[i].getnamaProduk()) + 3
                if math.floor(math.log10(abs(data_baju[i].getharga())) + 1) + 3 >= digitHarga :
                    digitHarga = math.floor(math.log10(abs(data_baju[i].getharga())) + 1) + 3
                if math.floor(math.log10(abs(data_baju[i].getstok())) + 1) + 3 >= digitStok :
                    digitStok = math.floor(math.log10(abs(data_baju[i].getstok())) + 1) + 3
                if len(data_baju[i].getJenis()) + 3 >= panjangJenis :
                    panjangJenis = len(data_baju[i].getJenis()) + 3
                if len(data_baju[i].getBahan()) + 3 >= panjangBahan :
                    panjangBahan = len(data_baju[i].getBahan()) + 3
                if len(data_baju[i].getWarna()) + 3 >= panjangWarna :
                    panjangWarna = len(data_baju[i].getWarna()) + 3
                if len(data_baju[i].getUntuk()) + 3 >= panjangUntuk :
                    panjangUntuk = len(data_baju[i].getUntuk()) + 3
                if len(data_baju[i].getSize()) + 3 >= panjangSize :
                    panjangSize = len(data_baju[i].getSize()) + 3
                if len(data_baju[i].getMerk()) + 3 >= panjangMerk :
                    panjangMerk = len(data_baju[i].getMerk()) + 3
            
            print("+", end="")
            for i in range (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk - 1) :
                print("-", end="")
            print("+")

            print("| ID", end="")
            for i in range (panjangId - 4) :
                print(" ", end="")
            print("| Nama Produk", end="")
            for i in range (panjangNama - 13) :
                print(" ", end="")
            print("| Harga", end="")
            for i in range (digitHarga - 7) :
                print(" ", end="")
            print("| Stok", end="")
            for i in range (digitStok - 6) :
                print(" ", end="")
            print("| Jenis", end="")
            for i in range (panjangJenis - 7) :
                print(" ", end="")
            print("| Bahan", end="")
            for i in range (panjangBahan - 7) :
                print(" ", end="")
            print("| Warna", end="")
            for i in range (panjangWarna - 7) :
                print(" ", end="")
            print("| Untuk", end="")
            for i in range (panjangUntuk - 7) :
                print(" ", end="")
            print("| Size", end="")
            for i in range (panjangSize - 6) :
                print(" ", end="")
            print("| Merk", end="")
            for i in range (panjangMerk - 6) :
                print(" ", end="")
            print("|")

            print("+", end="")
            for i in range (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk - 1) :
                print("-", end="")
            print("+")

            for i in range(n) :
                print("| " + data_baju[i].getID(), end="")
                for j in range ((panjangId-2) - len(data_baju[i].getID())) :
                    print(" ", end="")
                print("| " + data_baju[i].getnamaProduk(), end="")
                for j in range ((panjangNama-2) - len(data_baju[i].getnamaProduk())) :
                    print(" ", end="")
                print("|", data_baju[i].getharga(), end="")
                for j in range ((digitHarga-2) - math.floor(math.log10(abs(data_baju[i].getharga())) + 1)) :
                    print(" ", end="")
                print("|", data_baju[i].getstok(), end="")
                for j in range ((digitStok - 2) - math.floor(math.log10(abs(data_baju[i].getstok())) + 1)) :
                    print(" ", end="")
                print("| " + data_baju[i].getJenis(), end="")
                for j in range ((panjangJenis-2) - len(data_baju[i].getJenis())) :
                    print(" ", end="")
                print("| " + data_baju[i].getBahan(), end="")
                for j in range ((panjangBahan-2) - len(data_baju[i].getBahan())) :
                    print(" ", end="")
                print("| " + data_baju[i].getWarna(), end="")
                for j in range ((panjangWarna-2) - len(data_baju[i].getWarna())) :
                    print(" ", end="")
                print("| " + data_baju[i].getUntuk(), end="")
                for j in range ((panjangUntuk-2) - len(data_baju[i].getUntuk())) :
                    print(" ", end="")
                print("| " + data_baju[i].getSize(), end="")
                for j in range ((panjangSize-2) - len(data_baju[i].getSize())) :
                    print(" ", end="")
                print("| " + data_baju[i].getMerk(), end="")
                for j in range ((panjangMerk-2) - len(data_baju[i].getMerk())) :
                    print(" ", end="")
                print("|")
                
            print("+", end="")
            for i in range (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk - 1) :
                print("-", end="")
            print("+")
            print("")

        elif pilihan == 0:
            print("============================================")
            print("         Thank For Your Checking In         ")
            print("           Have A Nice Day Dawgg!           ")
            print("============================================")
            stop = 1