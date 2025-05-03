class Tentara {
    String nama;
    int energi;
    Senjata senjata;

    public static Senjata tes(){
        Senjata senjata = new Senjata();
        return senjata;
        
    }

    public Tentara() {
        this.nama = "";
        this.energi = 100;
        this.senjata = new Senjata();
    }

    public Tentara(String nama, int energi, Senjata senjata) {
        this.nama = nama;
        this.energi = energi;
        this.senjata = senjata;
    }

    public void serang(Tentara lawan) {
        int damage = this.senjata.getDamage();
        lawan.energi -= damage;
        System.out.println("\n" + this.nama + " menyerang " + lawan.nama + " menggunakan " + this.senjata.getNamaSenjata());
        System.out.println("Energi " + lawan.nama + " sekarang: " + lawan.energi);
    }

    public void tampilkanInfo() {
        System.out.println("\n"+ nama);
        System.out.println("Energi: " + energi);
        senjata.infoSenjata();
    }
    
    public void tampilkanStatus() {
        System.out.println("\n"+ nama);
        System.out.println("Energi: " + energi);
        if (energi > 50) {
            System.out.println(nama + " hanya terluka.");
        } else if (energi > 0) {
            System.out.println(nama + " sudah sekarat.");
        } else {
            System.out.println(nama + " sudah tewas.");
        }
    }
}

class Senjata {
    String namaSenjata;
    int damage;

    public Senjata() {
        this.namaSenjata = "Pistol";
        this.damage = 100;
    }

    public Senjata(String namaSenjata, int damage) {
        this.namaSenjata = namaSenjata;
        this.damage = damage;
    }

    public String getNamaSenjata() {
        return namaSenjata;
    }

    public int getDamage() {
        return damage;
    }

    public void infoSenjata() {
        System.out.println("Senjata: " + namaSenjata + ", Damage: " + damage);
    }
}
public class TuPrak3 {
    public static void main(String[] args) {
        Senjata senjata1 = new Senjata("AK-47", 30);
        Senjata senjata2 = new Senjata("Shotgun", 60);

        Tentara p1 = new Tentara("Tentara Jerman", 100, senjata1);
        Tentara p2 = new Tentara("Tentara Amerika", 100, senjata2);

        System.out.println("\nDATA TENTARA");
        p1.tampilkanInfo();
        p2.tampilkanInfo();

        System.out.println("\nAKSI SALING SERANG");
        p1.serang(p2);
        p2.serang(p1);
        
        System.out.println("\nSTATUS TENTARA SETELAH DISERANG");
        p1.tampilkanStatus();
        p2.tampilkanStatus();

        Tentara.tes().infoSenjata();
    }
}
