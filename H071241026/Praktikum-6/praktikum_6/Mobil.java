package praktikum_6;

import java.util.Date;
import java.util.Calendar;

public class Mobil extends Kendaraan implements IBergerak, IServiceable {
    private int jumlahPintu;
    private double kapasitasMesin;
    private int jumlahKursi;
    private String bahanBakar;
    private double kecepatan;
    private Date tanggalServis;

    public Mobil(String merek, String model) {
        super(merek, model);
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlah) {
        this.jumlahPintu = jumlah;
    }

    public double getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(double kapasitas) {
        this.kapasitasMesin = kapasitas;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlah) {
        this.jumlahKursi = jumlah;
    }

    public String getBahanBakar() {
        return bahanBakar;

    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public double hitungPajak() {
        return kapasitasMesin * 50;  //nilai sendiri
    }

    @Override
    public String getTipeKendaraan() {
        return "Mobil";

    }

    // IBERGERAK
    @Override
    public boolean mulai() {
        System.out.println("Mobil dinyalakan..");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Mobil berhenti..");
        return true;
    }

    @Override
    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    // ISERVICABLE
    @Override
    public boolean periksaKondisi() {
        System.out.println("Memeriksa kondisi mobil..");
        return true;
    }

    @Override
    public void lakukanService() {
        tanggalServis = new Date();
        System.out.println("Mobil sudah diservis");
    }

    @Override
    public Date getWaktuServiceBerikutnya() {
        if (tanggalServis == null) {    //belum pernah service
            return null;
        }
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(tanggalServis);      
        cal.add(Calendar.MONTH, 6);  //6bulan dri tanggal service terakhir
        return cal.getTime();
    }

    @Override
    public double hitungBiayaService() {   //biaya tetap
        return 20000 + (kapasitasMesin * kecepatan); //misalnya
    }
}
