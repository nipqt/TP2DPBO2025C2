<?php
require_once "Baju.php";
session_start();

if (!isset($_SESSION['datashop'])) {
    $_SESSION['datashop'] = [
        new Baju("A001", "Kalung_Kucing_Berlian", 50000, 15, "kolektip/kalung.jpg", "Kalung", "Kulit_Sintetis", "Merah", "Kucing", "M", "MeowStyle"),
        new Baju("A002", "Gelang_Kaki_Anjing", 30000, 20, "kolektip/gelang.jpg", "Gelang", "Karet", "Biru", "Anjing", "L", "PawCharm"),
        new Baju("A003", "Topi_Kucing_Fashion", 45000, 10, "kolektip/topi.jpg", "Topi", "Katun", "Hitam", "Kucing", "S", "FurryFashion"),
        new Baju("A004", "Dasi_Anjing_Formal", 40000, 8, "kolektip/dasi.jpg", "Dasi", "Satin", "Coklat", "Anjing", "M", "DogStyle"),
        new Baju("A005", "Bandana_Kelinci_Polkadot", 35000, 12, "kolektip/bandana.jpg", "Bandana", "Katun", "Pink", "Kelinci", "S", "BunnyTrend")
    ];
}

if (isset($_POST['pilihan'])) {
    $_SESSION['pilih'] = $_POST['pilih'];
    unset($_SESSION['searchID']);
}

if (isset($_POST['search'])) {
    $_SESSION['searchID'] = $_POST['searchID'];
}

$pilihan = $_SESSION['pilih'] ?? "";
$searchID = $_SESSION['searchID'] ?? "";
?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>DPBO Petshop By Nipqt</title>
    </head>
<style>
    table, th, td {
        border : 1px solid black;
    }
</style>
<body>
    <h1>Welcome To Nipqt Petshop 2.0</h1>
    +===============================+
    <h2>
    1 | Show </br>
    2 | Add </br>
    0 | Exit </br>
    </h2>
    +===============================+ </br>
    <form action="" method="post">
        Pilih Opsi diatas : <input type="text" name="pilih" id="">
        <button type="submit" name="pilihan">Submit</button>
    </form>
    <?php
        switch ($pilihan) {
            case 1:
    ?>
        <h1>Show</h1>
        <hr> </br>
        <table>
            <tr>
                <th>ID</th>
                <th>Nama Produk</th>
                <th>Harga</th>
                <th>Stok</th>
                <th>Jenis</th>
                <th>Bahan</th>
                <th>Warna</th>
                <th>Untuk</th>
                <th>Size</th>
                <th>Merk</th>
                <th>Gambar</th>
            </tr>
    <?php
        foreach ($_SESSION['datashop'] as $data) {
    ?>
            <tr>
                <td><?= $data->getID() ?></td>
                <td><?= $data->getnamaProduk() ?></td>
                <td><?= $data->getharga() ?></td>
                <td><?= $data->getstok() ?></td>
                <td><?= $data->getJenis() ?></td>
                <td><?= $data->getBahan() ?></td>
                <td><?= $data->getWarna() ?></td>
                <td><?= $data->getUntuk() ?></td>
                <td><?= $data->getSize() ?></td>
                <td><?= $data->getMerk() ?></td>
                <td><img src="<?= $data->getgambar() ?>" height=150 width=150 alt=""></td>
            </tr>
    <?php
        }
        break;
    ?>
    </table>
    <?php
        case 2:
    ?>
        <h1>Add</h1>
        <hr> </br>
        <form action="" method="post" enctype="multipart/form-data">
            ID : <input type="text" name="id" id="" required> </br> </br>
            Nama Produk : <input type="text" name="namaProduk" id="" required> </br> </br>
            Harga : <input type="text" name="harga" id="" required> </br> </br>
            Stok : <input type="text" name="stok" id="" required> </br> </br>
            Jenis : <input type="text" name="jenis" id="" required> </br> </br>
            Bahan : <input type="text" name="bahan" id="" required> </br> </br>
            Warna : <input type="text" name="warna" id="" required> </br> </br>
            Untuk : <input type="text" name="untuk" id="" required> </br> </br>
            Size : <input type="text" name="size" id="" required> </br> </br>
            Merk : <input type="text" name="merk" id="" required> </br> </br>
            Gambar : <input type="file" name="gambar" id=""> </br> </br>
            <button type="submit" name="add">Add</button>
        </form>
    <?php
        if (isset($_POST['add'])) {
            $id = $_POST['id'] ?? "";
            $ketemu = 0;
            foreach ($_SESSION['datashop'] as $data) {
                if ($data->getID() == $id) {
                    echo "</br>" . "Error : ID yang dimasukkan sama" . "</br>";
                    $ketemu = 1;
                }
            }
            if ($ketemu == 0) {
                $namaProduk = $_POST['namaProduk'] ?? "";
                $harga = $_POST['harga'] ?? "";
                $stok = $_POST['stok'] ?? "";
                $jenis = $_POST['jenis'] ?? "";
                $bahan = $_POST['bahan'] ?? "";
                $warna = $_POST['warna'] ?? "";
                $untuk = $_POST['untuk'] ?? "";
                $size = $_POST['size'] ?? "";
                $merk = $_POST['merk'] ?? "";
                $gambar = $_FILES['gambar'] ?? "";
                $target_file = "kolektip/" . basename($gambar["name"]);
                move_uploaded_file($gambar["tmp_name"], $target_file);
                $gambar = $target_file;
                $_SESSION['datashop'][] = new Baju($id, $namaProduk, $harga, $stok, $gambar, $jenis, $bahan, $warna, $untuk, $size, $merk);
                echo "</br>". "Data Has Been Added" . "</br>";
            }
        }
        break;
        case 0:
            session_destroy();
    
            if (ini_get("session.use_cookies")) {
                setcookie(session_name(), '', time() - 42000, '/'); // Hapus cookie session
            }
            
            header("Location: main.php"); // Redirect ke halaman utama
            exit();
        break;
    }
    ?>
</body>
</html>