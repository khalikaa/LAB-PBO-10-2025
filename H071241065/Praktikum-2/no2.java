public class no2 {
    int id;
    String nama;
    int stok;
    double harga;

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Integer getStock() {
        return stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Double getHarga() {
        return harga;
    }

    public void tampilkanProduk() {
        System.out.println("ID Barang : " + id);
        System.out.println("Nama barang : " + nama);
        System.out.println("Stok barang : " + stok);
        System.out.println("Harga barang Rp." + harga);

    }

    public Boolean cekBarang() {
        if (stok > 0) {
            System.out.println("Produk '" + nama + "' tersedia");
            return true;
        } else {
            System.out.println("Produk '" + nama + "' tidak tersedia");
            return false;
        }
    }

    public static void main(String[] args) {
        no2 produk1 = new no2();
        no2 produk2 = new no2();

        System.out.println("========= Barang 1 =========");
        produk1.setId(0);
        produk1.setNama("Ayam");
        produk1.setHarga(65000);
        produk1.setStok(10);
        produk1.tampilkanProduk();
        produk1.cekBarang();

        System.out.println("========= Barang 2 =========");
        produk2.setId(1);
        produk2.setNama("Sapi");
        produk2.setHarga(8000000);
        produk2.setStok(0);
        produk2.tampilkanProduk();
        produk2.cekBarang();

    }
}
