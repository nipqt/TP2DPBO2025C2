import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Baju[] data_baju = new Baju[51];
        data_baju[0] = new Baju("A001", "Kalung_Kucing_Berlian", 50000, 15, "Kalung", "Kulit_Sintetis", "Merah", "Kucing", "M", "MeowStyle");
        data_baju[1] = new Baju("A002", "Gelang_Kaki_Anjing", 30000, 20, "Gelang", "Karet", "Biru", "Anjing", "L", "PawCharm");
        data_baju[2] = new Baju("A003", "Topi_Kucing_Fashion", 45000, 10, "Topi", "Katun", "Hitam", "Kucing", "S", "FurryFashion");
        data_baju[3] = new Baju("A004", "Dasi_Anjing_Formal", 40000, 8, "Dasi", "Satin", "Coklat", "Anjing", "M", "DogStyle");
        data_baju[4] = new Baju("A005", "Bandana_Kelinci_Polkadot", 35000, 12, "Bandana", "Katun", "Pink", "Kelinci", "S", "BunnyTrend");

        int stop = 0, n = 5;
        int input = 0;
        Scanner scan = new Scanner(System.in);
        while (stop == 0) {
            System.out.println("|===========================================|");
            System.out.println("|       Welcome to Nipqt PetShop V2.0       |");
            System.out.println("|-------------------------------------------|");
            System.out.println("| 1 -> Add                                  |");
            System.out.println("| 2 -> Show                                 |");
            System.out.println("| 0 -> Exit                                 |");
            System.out.println("|===========================================|");
            System.out.println("");
            System.out.print("Pilih Opsi : ");
            try {
                input = scan.nextInt();
                if (input > 2) {
                    System.out.println("Tidak ada inputan (" + input + ")!");
                }
            } catch (Exception e) {
                System.out.println("The input is not an integer!");
            }

            switch (input) {
                case 1:
                    int addstop = 0, error = 0, next = 0;
                    String id, nama_produk, jenis, bahan, warna, untuk, size, merk;
                    int harga_produk, stok_produk;
                    while (addstop == 0) {
                        System.err.print("ID ('end' untuk mengakhiri) : "); id = scan.next();
                        if (id.equals("end")) {
                            addstop = 1;
                        } else {
                            next = 1;
                            error = 0;
                            int i = 0;
                            while ((error == 0) && (i < n)) {
                                if (data_baju[i].getID().equals(id)) {
                                    System.out.println("ERROR : ID (" + id + ") sama");
                                    error = 1;
                                } else {
                                    i++;
                                }
                            }
                            if (error == 0) {
                                System.out.print("Nama Produk                 : "); nama_produk = scan.next();
                                System.out.print("Harga Produk                : "); harga_produk = scan.nextInt();
                                System.out.print("Stok Produk                 : "); stok_produk = scan.nextInt();
                                System.out.print("Jenis                       : "); jenis = scan.next();
                                System.out.print("Bahan                       : "); bahan = scan.next();
                                System.out.print("Warna                       : "); warna = scan.next();
                                System.out.print("Untuk                       : "); untuk = scan.next();
                                System.out.print("Size                        : "); size = scan.next();
                                System.out.print("Merk                        : "); merk = scan.next();
                                data_baju[i] = new Baju(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk);
                                n++;
                            }
                        }
                    }
                    if ((next == 1) && (error == 0)) {
                        System.out.println("Data Has Been Added");
                    }
                    System.out.println("");
                    break;

                case 2:
                    int digitHarga = 8, digitStok = 7, panjangId = 5, panjangNama = 14, panjangJenis = 8, panjangBahan = 8, panjangWarna = 8, panjangUntuk = 8, panjangSize = 7, panjangMerk = 7;
                    for (int i = 0; i < n; i++) {
                        if (data_baju[i].getID().length() + 3 >= panjangId) {
                            panjangId = data_baju[i].getID().length() + 3;
                        }
                        if (data_baju[i].getnamaProduk().length() + 3 >= panjangNama) {
                            panjangNama = data_baju[i].getnamaProduk().length() + 3;
                        }
                        if ((int) Math.floor(Math.log10(Math.abs(data_baju[i].getharga())) + 1) + 3 >= digitHarga) {
                            digitHarga = (int) Math.floor(Math.log10(Math.abs(data_baju[i].getharga())) + 1) + 3;
                        }
                        if ((int) Math.floor(Math.log10(Math.abs(data_baju[i].getstok())) + 1) + 3 >= digitStok) {
                            digitStok = (int) Math.floor(Math.log10(Math.abs(data_baju[i].getstok())) + 1) + 3;
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
                    System.out.print("+");
                    for (int i = 0; i < (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk) - 1; i++) {
                        System.out.print("-");
                    }
                    System.out.println("+");
                    
                    System.out.print("| ID");
                    for (int i = 0; i < (panjangId-4); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Nama Produk");
                    for (int i = 0; i < (panjangNama-13); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Harga");
                    for (int i = 0; i < (digitHarga-7); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Stok");
                    for (int i = 0; i < (digitStok-6); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Jenis");
                    for (int i = 0; i < (panjangJenis-7); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Bahan");
                    for (int i = 0; i < (panjangBahan-7); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Warna");
                    for (int i = 0; i < (panjangWarna-7); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Untuk");
                    for (int i = 0; i < (panjangUntuk-7); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Size");
                    for (int i = 0; i < (panjangSize-6); i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Merk");
                    for (int i = 0; i < (panjangMerk-6); i++) {
                        System.out.print(" ");
                    }
                    System.out.println("|");
                    
                    System.out.print("+");
                    for (int i = 0; i < (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk) - 1; i++) {
                        System.out.print("-");
                    }
                    System.out.println("+");

                    for (int i = 0; i < n; i++) {
                        System.out.print("| " + data_baju[i].getID());
                        int spasi = (panjangId-2) - data_baju[i].getID().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getnamaProduk());
                        spasi = (panjangNama-2) - data_baju[i].getnamaProduk().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getharga());
                        spasi = (digitHarga-2) - (int) Math.floor(Math.log10(Math.abs(data_baju[i].getharga())) + 1);
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getstok());
                        spasi = (digitStok-2) - (int) Math.floor(Math.log10(Math.abs(data_baju[i].getstok())) + 1);
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getJenis());
                        spasi = (panjangJenis-2) - data_baju[i].getJenis().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getBahan());
                        spasi = (panjangBahan-2) - data_baju[i].getBahan().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getWarna());
                        spasi = (panjangWarna-2) - data_baju[i].getWarna().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getUntuk());
                        spasi = (panjangUntuk-2) - data_baju[i].getUntuk().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getSize());
                        spasi = (panjangSize-2) - data_baju[i].getSize().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + data_baju[i].getMerk());
                        spasi = (panjangMerk-2) - data_baju[i].getMerk().length();
                        for (int j = 0; j < spasi; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("|");
                    }

                    System.out.print("+");
                    for (int i = 0; i < (panjangId+panjangNama+digitHarga+digitStok+panjangBahan+panjangJenis+panjangWarna+panjangUntuk+panjangSize+panjangMerk) - 1; i++) {
                        System.out.print("-");
                    }
                    System.out.println("+");
                    System.out.println("");
                    break;

                case 0:
                    System.out.println("============================================");
                    System.out.println("         Thank For Your Checking In         ");
                    System.out.println("           Have A Nice Day Dawgg!           ");
                    System.out.println("============================================");
                    stop = 1;
                    break;

                default:
                    break;
            }
        }
    }
}