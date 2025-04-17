import java.util.Scanner;

public class TuPrak2NO2 {

    static class Produk {
        
        String id;
        String nama;
        int stok;
        int harga;

        
        public boolean cekKetersediaan() {
            return stok > 0;
        }

        public void tampilkanDataProduk() {
            System.out.println("ID Produk : " + id);
            System.out.println("Nama      : " + nama);
            System.out.println("Stok      : " + stok);
            System.out.println("Harga     : Rp" + harga);
            System.out.println("Status    : " + (stok ? "Tersedia" : "Kosong"));
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produk produk = new Produk();

        System.out.print("Masukkan ID Produk : ");
        produk.id = input.nextLine();

        System.out.print("Masukkan Nama Produk : ");
        produk.nama = input.nextLine();

        boolean validStok = false;
        while (!validStok) {
            System.out.print("Masukkan Stok Produk : ");
            if (input.hasNextInt()) {
                produk.stok = input.nextInt();
                if (produk.stok >= 0) {
                    validStok = true;
                } else {
                    System.out.println("Stok tidak boleh negatif");
                }
            } else {
                System.out.println("Stok harus berupa angka bulat");
                input.next(); 
            }
        }

        boolean validHarga = false;
        while (!validHarga) {
            System.out.print("Masukkan Harga Produk : ");
            if (input.hasNextInt()) {
                produk.harga = input.nextInt();
                if (produk.harga >= 0) {
                    validHarga = true;
                } else {
                    System.out.println("Harga tidak boleh negatif");
                }
            } else {
                System.out.println("Harga harus berupa angka");
                input.next(); 
            }
        }

        produk.tampilkanDataProduk();

        input.close();
    }
}
