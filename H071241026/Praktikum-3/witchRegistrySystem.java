public class witchRegistrySystem {
    String nama;
    int umur;
    String asal;
    TongkatSihir tongkat;
    Ramuan ramuan;

    public witchRegistrySystem() {
        this.nama = "Tanpa Nama";
        this.umur = 0;
        this.asal = "Tidak Diketahui";
        this.tongkat = new TongkatSihir();
        this.ramuan = new Ramuan();
    }

    public witchRegistrySystem (String nama, int umur, String asal, TongkatSihir tongkat, Ramuan ramuan) {
        this.nama = nama;
        this.umur = umur;
        this.asal = asal;
        this.tongkat = tongkat;
        this.ramuan = ramuan;
    }

    public void tampilkanInfo() {
        System.out.println("===== Data Penyihir =====");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Asal   : " + asal);
        System.out.println("--- Info Tongkat ---");
        tongkat.infoTongkat();
        System.out.println("--- Info Ramuan ---");
        ramuan.infoRamuan();
    } 

    public void sihir() {
        System.out.println(nama + " menggunakan sihir dari tongkat " + tongkat.bahan + "!");
    }

    public void duel(witchRegistrySystem lawan) {
        System.out.println(nama + " menyerang " + lawan.nama + " dengan kekuatan " + tongkat.kekuatan + "!"); 
        System.out.println(lawan.nama + " membalas dengan kekuatan " + lawan.tongkat.kekuatan + "!");

        if (tongkat.kekuatan < lawan.tongkat.kekuatan) {
            System.out.println(lawan.nama + " Menang!");
        } else if (tongkat.kekuatan == lawan.tongkat.kekuatan) {
            System.err.println("Seri");
        } else {
            System.out.println(nama + " Menang");
        }
    }

    public void latihanSihir() {
        tongkat.kekuatan += 3;                   //naik 3 poin
        System.out.println(nama + " berlatih... kekuatan tongkat bertambah jadi " + tongkat.kekuatan);
    }

    public void cekKekuatanTongkat() {
        tongkat.cekKekuatan();
    }

    public void gunakanRamuan() {
        ramuan.gunakan();
    }
}
