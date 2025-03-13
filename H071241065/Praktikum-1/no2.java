import java.util.Random;
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        // Membuat array 2D dengan angka acak
        int[][] nums = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(10); // Angka acak antara 0 dan 9
            }
        }

        // Menampilkan array
        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Meminta input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        try {
            int target = scanner.nextInt();

            // Mencari angka dalam array
            boolean ada = false;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Angka ditemukan di posisi [" + i + "][" + j + "]");
                        ada = true;
                        break;
                    }
                }
                if (ada)
                    break;
            }

            if (!ada) {
                System.out.println("Angka tidak ditemukan dalam array.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}