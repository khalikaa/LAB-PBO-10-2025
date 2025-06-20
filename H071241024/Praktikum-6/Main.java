package praktikum_6;

public class Main {
    public static void main(String[] args) {

        // === OBJEK MOBIL ===
        Mobil mobil1 = new Mobil("Toyota", "Avanza");
        mobil1.setTahunProduksi(2021);
        mobil1.setWarna("Hitam");
        mobil1.setJumlahPintu(4);
        mobil1.setKapasitasMesin(1.5);
        mobil1.setJumlahKursi(7);
        mobil1.setBahanBakar("Bensin");
        mobil1.setKecepatan(60);

        System.out.println("\n=== MOBIL ===");
        System.out.println("Merek: " + mobil1.getMerek());
        System.out.println("Model: " + mobil1.getModel());
        System.out.println("Tahun: " + mobil1.getTahunProduksi());
        System.out.println("Warna: " + mobil1.getWarna());
        System.out.println("Jumlah Pintu: " + mobil1.getJumlahPintu());
        System.out.println("Kapasitas Mesin: " + mobil1.getKapasitasMesin());
        System.out.println("Jumlah Kursi: " + mobil1.getJumlahKursi());
        System.out.println("Bahan Bakar: " + mobil1.getBahanBakar());
        System.out.println("Kecepatan: " + mobil1.getKecepatan());
        mobil1.mulai();
        mobil1.berhenti();
        mobil1.lakukanService();
        System.out.println("Biaya Servis: Rp" + mobil1.hitungBiayaService());
        System.out.println("Waktu Servis Berikutnya: " + mobil1.getWaktuServiceBerikutnya());

        // === OBJEK MOTOR ===
        Motor motor1 = new Motor("Yamaha", "NMax");
        motor1.setTahunProduksi(2022);
        motor1.setWarna("Biru");
        motor1.setJenisMotor("Skuter");
        motor1.setKapasitasTangki(5.0);
        motor1.setTipeSuspensi("Gas");
        motor1.setKecepatan(80);

        System.out.println("\n=== MOTOR ===");
        System.out.println("Merek: " + motor1.getMerek());
        System.out.println("Model: " + motor1.getModel());
        System.out.println("Jenis Motor: " + motor1.getJenisMotor());
        System.out.println("Tipe Suspensi: " + motor1.getTipeSuspensi());
        System.out.println("Kapasitas Tangki: " + motor1.getKapasitasTangki());
        System.out.println("Kecepatan: " + motor1.getKecepatan());
        motor1.mulai();
        motor1.berhenti();
        motor1.lakukanService();
        System.out.println("Biaya Servis: Rp" + motor1.hitungBiayaService());
        System.out.println("Waktu Servis Berikutnya: " + motor1.getWaktuServiceBerikutnya());

        // === OBJEK SEPEDA ===
        Sepeda sepeda1 = new Sepeda("Polygon", "Monarch");
        sepeda1.setTahunProduksi(2020);
        sepeda1.setWarna("Merah");
        sepeda1.setJenisSepeda("Gunung");
        sepeda1.setJumlahGear(21);
        sepeda1.setUkuranRoda(27);
        sepeda1.setKecepatan(20);

        System.out.println("\n=== SEPEDA ===");
        System.out.println("Merek: " + sepeda1.getMerek());
        System.out.println("Model: " + sepeda1.getModel());
        System.out.println("Jenis Sepeda: " + sepeda1.getJenisSepeda());
        System.out.println("Jumlah Gear: " + sepeda1.getJumlahGear());
        System.out.println("Ukuran Roda: " + sepeda1.getUkuranRoda());
        System.out.println("Kecepatan: " + sepeda1.getKecepatan());
        sepeda1.mulai();
        sepeda1.berhenti();
        sepeda1.lakukanService();
        System.out.println("Biaya Servis: Rp" + sepeda1.hitungBiayaService());
        System.out.println("Waktu Servis Berikutnya: " + sepeda1.getWaktuServiceBerikutnya());

        // === OBJEK SKUTER LISTRIK ===
        SkuterListrik sk = new SkuterListrik("Xiaomi", "M365");
        sk.setTahunProduksi(2024);
        sk.setWarna("Merah");
        sk.mulai();
        sk.setKecepatan(20);
        System.out.println("\n=== SKUTER LISTRIK ===");
        System.out.println("Merek: " + sk.getMerek());
        System.out.println("Model: " + sk.getModel());
        System.out.println("Tipe: " + sk.getTipeKendaraan());
        System.out.println("Kecepatan: " + sk.getKecepatan() + " km/h");
        sk.berhenti();
        System.out.println("Pajak skuter: Rp" + sk.hitungPajak());
    }
}