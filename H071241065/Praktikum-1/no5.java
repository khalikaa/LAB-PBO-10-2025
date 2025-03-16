import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input password dari pengguna
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Memvalidasi password
        if (validasiPassword(password)) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }

        scanner.close();
    }

    // Fungsi untuk memvalidasi password
    public static boolean validasiPassword(String password) {
        // Cek panjang password minimal 8 karakter
        if (password.length() < 8) {
            return false;
        }

        boolean adaHurufBesar = false;
        boolean adaHurufKecil = false;
        boolean adaAngka = false;

        // Iterasi melalui setiap karakter dalam password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                adaHurufBesar = true;
            } else if (Character.isLowerCase(c)) {
                adaHurufKecil = true;
            } else if (Character.isDigit(c)) {
                adaAngka = true;
            }

            // Jika semua kriteria terpenuhi, keluar dari loop
            if (adaHurufBesar && adaHurufKecil && adaAngka) {
                break;
            }
        }

        // mengembalikn true jika semua kriteria terpenuhi
        return adaHurufBesar && adaHurufKecil && adaAngka;
    }
}