class Produk { 
    private String idProduk; 
    private String nama;
    private int stok;
    private double harga;

    public Produk(String idProduk, String nama, int stok, double harga) {
        this.idProduk = idProduk;
        this.nama = nama; 
        this.stok = stok; 
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("ID Produk : " + idProduk);
        System.out.println("Nama      : " + nama);
        System.out.println("Stok      : " + stok);
        System.out.println("Harga     : Rp" + String.format("%,.2f", harga));
    }
    public boolean tersediaDiStok() {
        return stok > 0;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

public class Daftarproduk {
    public static void main(String[] args) {
        Produk produk1 = new Produk("P001", "Kopi Bubuk", 25, 35000);
        produk1.tampilkanInfo();

        if (produk1.tersediaDiStok()) {
            System.out.println("Status: Produk tersedia di stok.");
        } else {
            System.out.println("Status: Produk tidak tersedia.");
        }
        Produk produk2 = new Produk("P002", "Teh", 0, 30000);
        produk2.tampilkanInfo();

        if (produk2.tersediaDiStok()) {
            System.out.println("Status: Produk tersedia di stok.");
        } else {
            System.out.println("Status: Produk tidak tersedia.");
        }
    }
}
