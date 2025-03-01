public class Baju extends Aksesoris{
    private String untuk;
    private String size;
    private String merk;

    public Baju() {
    }

    public Baju(String id, String namaProduk, int hargaProduk, int stokProduk, String jenis, String bahan, String warna, String untuk, String size, String merk) {
        super(id, namaProduk, hargaProduk, stokProduk, jenis, bahan, warna);
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    public String getUntuk() {
        return this.untuk;
    }

    public String getSize() {
        return this.size;
    }

    public String getMerk() {
        return this.merk;
    }
}
