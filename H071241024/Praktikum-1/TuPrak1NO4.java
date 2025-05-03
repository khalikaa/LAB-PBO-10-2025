import java.util.Scanner;

public class TuPrak1NO4 {

    public static int faktorial(int angka) {
        if (angka == 0 || angka == 1) {
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int angka = scanner.nextInt();
            
            if (angka>=0){
            System.out.println(faktorial(angka));
            }else{
                System.out.println("Tidak boleh minus");
            }
        } catch (Exception e) {
            System.out.println("Harus Angka");
        } finally {
            scanner.close();
        }
    }
}
