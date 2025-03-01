public class PetShop {
    private String ID;
    private String nama_produk;
    private int harga_produk;
    private int stok_produk;

    public PetShop(){
    }
    
    public PetShop(String ID, String nama_produk, int harga_produk, int stok_produk){
        this.ID = ID;
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
        this.stok_produk = stok_produk;
    }

    public String getID() {
        return this.ID;
    }

    public String getnamaProduk() {
        return this.nama_produk;
    }

    public int getharga() {
        return this.harga_produk;
    }

    public int getstok() {
        return this.stok_produk;
    }
}