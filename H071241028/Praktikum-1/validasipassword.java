import java.util.Scanner;

public class validasipassword {
    public static boolean passwordValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean adaHurufBesar = false, adaHurufKecil = false, adaAngka = false;
        
        for (char karakter : password.toCharArray()) {
            if (Character.isUpperCase(karakter)) {
                adaHurufBesar = true;
            } else if (Character.isLowerCase(karakter)) {
                adaHurufKecil = true;
            } else if (Character.isDigit(karakter)) {
                adaAngka = true;
            }
            
            if (adaHurufBesar && adaHurufKecil && adaAngka) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan kata sandi: ");
        String kataSandi = x.nextLine();
        x.close();
        
        if (passwordValid(kataSandi)) {
            System.out.println("Kata sandi valid");
        } else {
            System.out.println("Kata sandi tidak valid. Harus minimal 8 karakter, mengandung huruf besar, huruf kecil, dan angka.");
        }
    }
}
