class Jetpack {
    private String merk;
    private int fuel;
    private int power;

    // Constructor default
    public Jetpack() {
        this.merk = "Oppo";
        this.fuel = 100;
        this.power = 25;
    }

    // Constructor dengan parameter
    public Jetpack(String merk, int fuel, int power) {
        this.merk = merk;
        this.fuel = fuel;
        this.power = power;
    }

    public int getFuel() {
        return fuel;
    }

    public int getPower() {
        return power;
    }

    public String getMerk() {
        return merk;
    }

    public void kurangiFuel(int jumlah) {
        this.fuel -= jumlah;
    }

    public void isiFuel(int jumlah) {
        this.fuel += jumlah;
    }

    public void infoJetpack() {
        System.out.println("Jetpack " + merk + " | Fuel: " + fuel + " | Power: " + power);
    }
}

class Astronot {
    private String nama;
    private int energi;
    private Jetpack jetpack;

    // Constructor default
    public Astronot() {
        this.nama = "Aco'";
        this.energi = 100;
        this.jetpack = new Jetpack();
    }

    // Constructor dengan parameter
    public Astronot(String nama, int energi, Jetpack jetpack) {
        this.nama = nama;
        this.energi = energi;
        this.jetpack = jetpack;
    }

    // Method info
    public void info() {
        System.out.println("\nNama Astronot: " + nama);
        System.out.println("Energi: " + energi);
        jetpack.infoJetpack();
    }

    // Method status
    public void status() {
        if (energi <= 0) {
            System.out.println(nama + " tidak sadar. Perlu pertolongan!");
        } else if (jetpack.getFuel() <= 0) {
            System.out.println(nama + " kehabisan bahan bakar jetpack.");
        } else if (energi < 30) {
            System.out.println(nama + " mulai kelelahan. Sebaiknya istirahat.");
        } else {
            System.out.println(nama + " dalam kondisi prima dan siap beraksi!");
        }
    }

    // Method interaksi antar objek: menyerang
    public void terbang(Astronot target) {
        int damage = this.jetpack.getPower();
        if (this.jetpack.getFuel() <= 0) {
            System.out.println(nama + " gagal menyerang. Jetpack kehabisan fuel!");
            return;
        }

        this.jetpack.kurangiFuel(10);
        target.energi -= damage;

        System.out.println(nama + " menyerang " + target.nama + " menggunakan Jetpack " + jetpack.getMerk() + "!");
        System.out.println("Energi " + target.nama + " sekarang: " + target.energi);
        System.out.println("Fuel jetpack " + nama + ": " + this.jetpack.getFuel());
    }
}

public class TuPrak3NO1 {
    public static void main(String[] args) {
        // Membuat objek Jetpack
        Jetpack jp1 = new Jetpack("NebulaV2", 100, 30);
        Jetpack jp2 = new Jetpack("StellarJet", 30, 20);

        // Membuat objek Astronot
        Astronot a1 = new Astronot("Tralalelo", 0, jp1);
        Astronot a2 = new Astronot("Bombardilo", 20, jp2);

        // Menampilkan info awal
        a1.info();
        a2.info();

        System.out.println("\nSTATUS");
        a1.status();
        a2.status();

        System.out.println("\nSERANGAN");
        a1.terbang(a2);

        System.out.println("\nSTATUS AKHIR");
        a1.status();
        a2.status();
    }
}
