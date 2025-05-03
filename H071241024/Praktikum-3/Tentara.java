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