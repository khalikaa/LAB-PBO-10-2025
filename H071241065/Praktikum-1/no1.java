import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String input = scanner.nextLine();
        String output = hurufAwalBesar(input);
        System.out.println(output);

        scanner.close();
    }

    public static String hurufAwalBesar(String str) {
        if (str.isEmpty()) {
            return "inputan tdk boleh kosong";
        }

        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            // if (word.length() > 0) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
            // }
        }

        return result.toString();
    }
}