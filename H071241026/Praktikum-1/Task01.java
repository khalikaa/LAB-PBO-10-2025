import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Judul Film: ");
        String input = scanner.nextLine();
        scanner.close();
        
        if (input == ""){
            System.out.println("Masukkan Inputan yang benar");

        } else {
            String output = ""; // Inisialisasi string kosong untuk menyimpan hasil akhir
            for (String word : input.toLowerCase().split(" ")) {
                output += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
    
            System.out.println(output.trim()); 
    } 
}
}