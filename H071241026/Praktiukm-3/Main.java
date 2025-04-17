public class Main {
    public static void main(String[] args) {
        TongkatSihir tongkat1 = new TongkatSihir("Kayu Mahoni", 15, 4, "Hutan Timur");
        Ramuan ramuan1 = new Ramuan("Ramuan Api", "Menambah kekuatan", 2);
        witchRegistrySystem penyihir1 = new witchRegistrySystem("Naca", 19, "Desa Awan", tongkat1, ramuan1);

        TongkatSihir tongkat2 = new TongkatSihir("Kayu Ebony", 18, 5, "Hutan Selatan");
        Ramuan ramuan2 = new Ramuan("Ramuan Petir", "Meningkatkan serangan", 1);
        witchRegistrySystem penyihir2 = new witchRegistrySystem("Luna", 20, "Desa Kabut", tongkat2, ramuan2);

        System.out.println("=== DATA PENYIHIR 1 ===");
        penyihir1.tampilkanInfo();

        System.out.println("\n=== DATA PENYIHIR 2 ===");
        penyihir2.tampilkanInfo();

        System.out.println("\n=== AKSI PENYIHIR 1 ===");
        penyihir1.latihanSihir();
        penyihir1.gunakanRamuan();                                              
        penyihir1.cekKekuatanTongkat();

        System.out.println("\n=== AKSI PENYIHIR 2 ===");
        penyihir2.latihanSihir();
        penyihir2.gunakanRamuan();
        penyihir2.cekKekuatanTongkat();

        System.out.println("\n=== D U E L ===");
        penyihir1.duel(penyihir2);
    }
}
