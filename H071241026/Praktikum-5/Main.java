import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;

        int pilihan = 0;
        boolean valid = false;

        // Pilih karakter
        while (!valid) {
            try {
                System.out.println("\nPilih karakter: ");
                System.out.println("1. Archer");
                System.out.println("2. Wizard");
                System.out.println("3. Fighter");
                System.out.print("Pilihan Karakter: ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        hero = new Archer("Archer", 100, 15);
                        valid = true;
                        break;
                    case 2:
                        hero = new Wizard("Wizard", 90, 20);
                        valid = true;
                        break;
                    case 3:
                        hero = new Fighter("Fighter", 120, 10);
                        valid = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia. Coba lagi.\n");
                    }
            } catch (Exception e) {
                System.out.println("Inputan harus berupa angka. Coba lagi!");
                scanner.nextLine();
            }
        }
        boolean aksiValid = true;
        while (aksiValid) {
            System.out.println("\nPilih aksi: ");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilihan: ");

            try {
                int aksi = scanner.nextInt();
                scanner.nextLine(); // buang newline

                if (aksi == 1) {
                    hero.attack();
                } else if (aksi == 2) {
                    System.out.println("Game Selesai!");
                    aksiValid = false;
                } else {
                    System.out.println("Pilihan tidak tersedia!");
                }

                } catch (Exception e) {
                    System.out.println("Inputan harus berupa angka!\n");
                    scanner.nextLine();
            }
        }
        scanner.close();
    }
}