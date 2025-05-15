package praktikum_6;

import java.util.Date;
import java.util.Calendar;

public class Motor extends Kendaraan implements IServiceable, IBergerak {
    private String jenisMotor;
    private double kapasitasTangki;
    private String tipeSuspensi;
    private double kecepatan;
    private Date tanggalServis;

    public Motor(String merek, String model) {
        super(merek, model);
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenis) {
        this.jenisMotor = jenis;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitas) {
        this.kapasitasTangki = kapasitas;
    }

    public String getTipeSuspensi() {
        return tipeSuspensi;
    }

    public void setTipeSuspensi(String tipe) {
        this.tipeSuspensi = tipe;
    }

    @Override
    public double hitungPajak() {
        return kapasitasTangki * 50000;
    }

    @Override
    public String getTipeKendaraan() {
        return "Motor";

    }

    // IBERGERAK
    @Override
    public boolean mulai() {
        System.out.println("Motor dinyalakan..");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Motor berhenti..");
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
        System.out.println("Memeriksa kondisi motor..");
        return true;
    }

    @Override
    public void lakukanService() {
        tanggalServis = new Date();
        System.out.println("Motor sudah diservis");
    }

    @Override
    public Date getWaktuServiceBerikutnya() {
        if (tanggalServis == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(tanggalServis);
        cal.add(Calendar.MONTH, 6);
        return cal.getTime();
    }

    @Override
    public double hitungBiayaService() {
        return 50000 + (kapasitasTangki * kecepatan);
    }
}
