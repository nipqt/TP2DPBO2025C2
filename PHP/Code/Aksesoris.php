<?php
require_once "PetShop.php";

class Aksesoris extends PetShop {
    private $jenis = "";
    private $bahan = "";
    private $warna = "";

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $gambar, $jenis, $bahan, $warna) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $gambar);
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    public function getJenis() {
        return $this->jenis;
    }

    public function getBahan() {
        return $this->bahan;
    }

    public function getWarna() {
        return $this->warna;
    }
}

?>