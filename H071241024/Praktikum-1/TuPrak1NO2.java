import java.util.Scanner;

public class TuPrak1NO2 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        Scanner scanner = new Scanner (System.in);

        try {
            int angka = scanner.nextInt();
            boolean ditemukan = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == angka) { 
                        System.out.println("Found " + angka + " at [" + i +"][" + j  +"]");
                        ditemukan = true;
                        break;
                    }    
                }
                if (ditemukan) break;
            }
            if (!ditemukan){
                System.out.println("tidak ditemukan");
            }
        }catch (Exception e) {
            System.out.println("Harus Angka");
        }finally{
            scanner.close();
        }
    }                  
}


