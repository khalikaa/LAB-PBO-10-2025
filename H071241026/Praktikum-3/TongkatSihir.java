public class TongkatSihir {
    String bahan;
    int kekuatan;
    int umur;
    String asal;

    public TongkatSihir() {
        this.bahan = "Kayu Biasa";
        this.kekuatan = 10;
        this.umur = 1;
        this.asal = "Tidak Diketahui";
    }

    public TongkatSihir(String bahan, int kekuatan, int umur, String asal) {
        this.bahan = bahan;
        this.kekuatan = kekuatan;
        this.umur = umur;
        this.asal = asal;
    }

    public void infoTongkat() {
        System.out.println("Tongkat dari bahan " + bahan);
        System.out.println("Kekuatan        : " + kekuatan);
        System.out.println("Umur tongkat    : " + umur + " tahun");
        System.out.println("Asal tongkat    : " + asal);
    
    }

    public void tingkatkanKekuatan(int tambahan) {
        kekuatan += tambahan;
        System.out.println("Kekuatan tongkat meningkat jadi " + kekuatan);
    }

    public void cekKekuatan() {       
        if (kekuatan < 10) {
            System.out.println("Kekuatan tongkat lemah!");
        } else if (kekuatan <= 20) {
            System.out.println("Kekuatan tongkat sedang!");
        } else {
            System.out.println("Kekuatan tongkat sangat kuat!");
        }
    }
    
    public void resetKekuatan() {
        kekuatan = 10;
        System.out.println("Kekuatan tongkat telah di-reset ke 10!");
    }

}
