public class Aksesoris extends PetShop{
    private String jenis;
    private String bahan;
    private String warna;

    public Aksesoris() {
    }

    public Aksesoris(String id, String nama_produk, int harga_produk, int stok_produk, String jenis, String bahan, String warna) {
        super(id, nama_produk, harga_produk, stok_produk);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    public String getJenis(){
        return this.jenis;
    }

    public String getBahan(){
        return this.bahan;
    }

    public String getWarna(){
        return this.warna;
    }
}
