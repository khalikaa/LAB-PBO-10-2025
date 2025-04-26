import karyawan.Karyawan;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        System.out.print("Berapa banyak karyawan yang ingin didaftarkan? ");
        int jumlahInput = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        for (int i = 0; i < jumlahInput; i++) {
            System.out.print("Masukkan nama karyawan ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan id karyawan ke-" + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            Karyawan karyawan = new Karyawan(nama, id);
            daftarKaryawan.add(karyawan);
        }

        System.out.println("\nJumlah karyawan saat ini: " + Karyawan.getJumlahKaryawan());

        // Menampilkan daftar karyawan
        System.out.println("\nDaftar Karyawan:");
        for (int i = 0; i < daftarKaryawan.size(); i++) {
            Karyawan k = daftarKaryawan.get(i);
            System.out.println((i + 1) + ". " + k.getNama() + " (ID: " + k.getId() + ")");
        }

        // Memilih karyawan yang naik pangkat
        System.out.print("\nPilih nomor karyawan yang ingin naik pangkat: ");
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= daftarKaryawan.size()) {
            Karyawan dipromosikan = daftarKaryawan.get(pilihan - 1);
            dipromosikan.naikPangkat();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        System.out.println("\nJumlah karyawan setelah naik pangkat: " + Karyawan.getJumlahKaryawan());

        scanner.close();
    }
}
