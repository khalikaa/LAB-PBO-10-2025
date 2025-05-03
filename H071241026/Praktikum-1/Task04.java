import java.util.Scanner;

public class Task04 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Basis rekursi
        } else {
            return n * factorial(n - 1); // Rekursi memanggil dirinya sendiri
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Bilangan tidak boleh minus");
        } else {
            System.out.println("Hasil faktorial: " + factorial(n));
        }
        scanner.close();
    
    }
}
