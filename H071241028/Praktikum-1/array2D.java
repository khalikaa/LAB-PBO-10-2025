import java.util.Random;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        int[][] angka = new int[3][3];
        Random random = new Random();
        Scanner x = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                angka[i][j] = random.nextInt(9) + 1;
            }
        }
        
        System.out.println("Array angka:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
        
        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = x.nextInt();
            
            boolean ditemukan = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (angka[i][j] == target) {
                        System.out.println("Ditemukan " + target + " di [" + i + "][" + j + "]");
                        ditemukan = true;
                        break;
                    }
                }
                if (ditemukan) break;
            }
            
            if (!ditemukan) {
                System.out.println("Angka tidak ditemukan dalam array.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
        } finally {
            x.close();
        }
    }
}

