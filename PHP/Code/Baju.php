<?php
require_once "Aksesoris.php";

class Baju extends Aksesoris {
    private $untuk = "";
    private $size = "";
    private $merk = "";

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $gambar, $jenis, $bahan, $warna, $untuk, $size, $merk) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $gambar, $jenis, $bahan, $warna);
        $this->untuk = $untuk;
        $this->size = $size;
        $this->merk = $merk;
    }

    public function getUntuk() {
        return $this->untuk;
    }

    public function getSize() {
        return $this->size;
    }

    public function getMerk() {
        return $this->merk;
    }
}

?>