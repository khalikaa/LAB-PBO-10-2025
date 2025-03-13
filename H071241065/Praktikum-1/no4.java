import java.util.Scanner;
import java.util.InputMismatchException;

public class no4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Masukkan angka");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("input tidak valid");
                return;
            }
            long output = faktorial(n);
            System.out.println(output);

        } catch (InputMismatchException e) {
            System.out.println("hanya angka");
        } finally {
            scanner.close();
        }
    }

    public static long faktorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}
