package praktikum_6;

public class UburUburListrik extends Kendaraan implements IBergerak {
    private double kecepatan;

    public UburUburListrik(String merek, String model) {
        super(merek, model);
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public String getTipeKendaraan() {
        return "Makhluk Bergerak Eksperimental: Ubur-Ubur Listrik";
    }

    @Override
    public boolean mulai() {
        System.out.println("Ubur-ubur listrik mulai mengambang dengan arus listrik...");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Ubur-ubur listrik berhenti dan melayang diam...");
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
}
