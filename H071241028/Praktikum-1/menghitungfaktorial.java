import java.util.Scanner;

public class menghitungfaktorial {
    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan bilangan untuk dihitung faktorialnya: ");
        int n = x.nextInt();
        x.close();
        
        if ( n < 0){
            System.out.println("Inputan tidak boleh minus");
        }else{
            System.out.println("Hasil: " + hitungFaktorial(n));
        }
    }
}
