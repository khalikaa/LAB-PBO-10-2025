import java.util.Scanner;

public class TuPrak1NO1 {
    
    public static String JudulFilm(String kalimat){
        String hasil = "";
        
        String[] kata = kalimat.split(" ");
        for (String k : kata) {
            if (k.isEmpty()) {
                System.out.print("Jangan kosong");
            } else {
                hasil = Character.toUpperCase(k.charAt(0)) + k.substring(1).toLowerCase() + " ";
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : \n");
        String kalimat = scanner.nextLine();

        System.out.println(JudulFilm(kalimat));
        scanner.close();
    }
}
