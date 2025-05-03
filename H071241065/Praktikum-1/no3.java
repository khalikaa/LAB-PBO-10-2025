import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String input = scanner.nextLine();
        scanner.close();

        // Memisahkan bagian tanggal, bulan, dan tahun
        String[] parts = input.split("-");
        if (parts.length != 3) {
            System.out.println("Format tanggal salah!");
            return;
        }

        int day = Integer.parseInt(parts[0]); // Ambil hari
        int month = Integer.parseInt(parts[1]); // Ambil bulan
        int year = Integer.parseInt(parts[2]); // Ambil tahun
        // Konversi tahun dari yy ke yyyy
        if (day < 0 || day > 31) {
            System.out.println("masukkan tanggal yang valid");
            return;
        }
        year = (year >= 0 && year <= 25) ? (2000 + year) : (1900 + year);

        // Array nama bulan
        String[] bulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        // Validasi bulan
        if (month < 1 || month > 12) {
            System.out.println("Bulan tidak valid!");
            return;
        }

        // Output hasil konversi
        System.out.println(day + " " + bulan[month - 1] + " " + year);
    }
}
