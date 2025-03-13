import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
 
        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = scanner.nextInt();

            boolean found = false; /// Awalnya diasumsikan tidak ditemukan
            for (int i = 0; i < nums.length; i++) {  //loop untuk baris
                for (int j = 0; j < nums[i].length; j++) { //Loop untuk kolom dalam baris ke-i
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        found = true;
                        break;  //Menggunakan break; untuk menghentikan pencarian begitu angka ditemukan (agar lebih efisien)
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println(target + " tidak ditemukan dalam array.");
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        } finally {
            scanner.close();
        }
    }
}