
package kendaraan;

import kendaraan.model.Mobil;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza");
    
        mobil1.setJumlahPintu(4);
        mobil1.setKapasitasMesin(1.5); // 1.5 liter
        mobil1.setJumlahKursi(7);
        mobil1.setBahanBakar("Bensin");
        mobil1.setTahunProduksi(2022);
        mobil1.setWarna("Hitam");
        mobil1.setKecepatan(0); // default sebelum mulai

        // Menampilkan informasi dari getter
        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println("Merek           : " + mobil1.getMerek());
        System.out.println("Model           : " + mobil1.getModel());
        System.out.println("Tahun Produksi  : " + mobil1.getTahunProduksi());
        System.out.println("Warna           : " + mobil1.getWarna());
        System.out.println("Jumlah Pintu    : " + mobil1.getJumlahPintu());
        System.out.println("Kapasitas Mesin : " + mobil1.getKapasitasMesin() + " L");
        System.out.println("Jumlah Kursi    : " + mobil1.JumlahKursi());
        System.out.println("Bahan Bakar     : " + mobil1.BahanBakar());

        // Memanggil method interface dan class induk
        System.out.println("\n=== PERILAKU MOBIL ===");
        System.out.println("Mulai?          : " + mobil1.mulai());
        System.out.println("Kecepatan       : " + mobil1.getKecepatan() + " km/jam");
        System.out.println("Berhenti?       : " + mobil1.berhenti());
        System.out.println("Kecepatan Setelah Berhenti: " + mobil1.getKecepatan() + " km/jam");

        System.out.println("\n=== SERVIS MOBIL ===");
        System.out.println("Kondisi Baik?   : " + mobil1.periksaKondisi());
        mobil1.lakukanServis();
        System.out.println("Waktu Servis Berikutnya : " + mobil1.getWaktuServisBerikutnya());
        System.out.println("Biaya Servis    : Rp" + mobil1.hitungBiayaServis());

        System.out.println("\n=== LAINNYA ===");
        System.out.println("Pajak           : Rp" + mobil1.hitungPajak());
        System.out.println("Tipe Kendaraan  : " + mobil1.getTipeKendaraan());
    }
}   



