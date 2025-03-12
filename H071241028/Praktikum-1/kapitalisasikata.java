import java.util.Scanner;

class PemformatTeks {
    public String kapitalSetiapKata(String teks) {
        String[] words = teks.split(" ");
        StringBuilder hasil = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                hasil.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            } else{
                System.out.println(" masukkan inputan yang benar");
            }
        }
        
        return hasil.toString();
    }
}

public class kapitalisasikata {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan judul film: ");
        String input = x.nextLine();
        x.close();
        
        PemformatTeks pemformat = new PemformatTeks();
        String output = pemformat.kapitalSetiapKata(input);
        System.out.println(output);
    }
}

