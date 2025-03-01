<?php

class PetShop {
    private $ID = "";
    private $nama_produk = "";
    private $harga_produk = 0;
    private $stok_produk = 0;
    private $gambar = "";

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $gambar) {
        $this->ID = $id;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
        $this->gambar = $gambar;
    }
    
    public function getID() {
        return $this->ID;
    }

    public function getnamaProduk() {
        return $this->nama_produk;
    }

    public function getstok() {
        return $this->stok_produk;
    }

    public function getharga() {
        return $this->harga_produk;
    }

    public function getgambar() {
        return $this->gambar;
    }
}
?>