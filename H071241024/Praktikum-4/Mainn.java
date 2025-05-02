import java.util.Random;
import java.util.Scanner;

class UserAccount {
    private String username;
    private double saldo;

    public UserAccount(String username, double saldoAwal) {
        this.username = username;
        if (saldoAwal < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoAwal;
        }
    }

    public void cekSaldo() {
        System.out.println("Saldo " + username + ": Rp " + saldo);
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil deposit Rp " + jumlah);
        } else {
            System.out.println("Jumlah deposit harus positif.");
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil withdraw Rp " + jumlah);
        } else {
            System.out.println("Gagal withdraw. Cek saldo atau jumlah yang dimasukkan.");
        }
    }

    public void spin(Scanner scanner) {
        Random random = new Random();
        int angkaRandom = random.nextInt(10)+1;
        System.out.print("Tebak angka (0-10): ");
        int tebakan = scanner.nextInt();

        if (tebakan == angkaRandom) {
            saldo *= 2;
            System.out.println("Tebakan benar! Saldo menjadi 2x lipat.");
        } else {
            saldo /= 2;
            System.out.println("Tebakan salah. Saldo menjadi setengah.");
        }
    }
}

public class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan saldo awal: Rp ");
        double saldoAwal = scanner.nextDouble();

        UserAccount account = new UserAccount(username, saldoAwal);

        boolean running = true;
        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Spin");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");

            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    account.cekSaldo();
                    break;
                case 2:
                    System.out.print("Jumlah deposit: Rp ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Jumlah withdraw: Rp ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 4:
                    account.spin(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih! Sampai jumpa.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
        scanner.close();
    }
}
