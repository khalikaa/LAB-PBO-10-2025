package praktikum_6;

public class SkuterListrik extends Kendaraan implements IBergerak {
    private double kecepatan;

    public SkuterListrik(String merek, String model) {
        super(merek, model);
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public String getTipeKendaraan() {
        return "Kendaraan Elektrik Ringan: Skuter Listrik";
    }

    @Override
    public boolean mulai() {
        System.out.println("Skuter listrik dinyalakan, siap jalan!");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Skuter listrik dimatikan, berhenti total.");
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
