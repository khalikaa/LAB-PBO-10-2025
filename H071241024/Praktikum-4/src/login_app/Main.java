package src.login_app;

import java.util.*;
import src.login_app.models.*;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
        }
    }

    private static void showMenu() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");
        String pilih = sc.nextLine();

        switch (pilih) {
            case "1": login(); break;
            case "2": register(); break;
            default: System.out.println("Pilihan tidak valid.\n");
        }
    }


    private static void register() {
        System.out.println("\n-------------------------");
        System.out.println("REGISTER");

        System.out.print("Username: ");
        String username = sc.nextLine().trim();
        if (username.isEmpty() || isUsernameTaken(username)) {
            System.out.println("Username tidak valid atau sudah digunakan.\n");
            return;
        }

        System.out.print("Password: ");
        String password = sc.nextLine().trim();
        if (password.length() < 8) {
            System.out.println("Password minimal 8 karakter.\n");
            return;
        }

        System.out.print("Nama Lengkap: ");
        String fullName = sc.nextLine().trim();
        if (fullName.isEmpty()) {
            System.out.println("Nama tidak boleh kosong.\n");
            return;
        }

        System.out.print("Umur: ");
        int age;
        try {
            age = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Umur harus berupa angka.\n");
            return;
        }

        System.out.print("Hobby: ");
        String hobby = sc.nextLine().trim();
        if (hobby.isEmpty()) {
            System.out.println("Hobby tidak boleh kosong.\n");
            return;
        }

        User user = new User(username, password);
        Profile profile = new Profile(fullName, age, hobby);

        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listProfile.add(profile);

        System.out.println("Berhasil Membuat User Baru!!\n");
    }
    
    private static boolean isUsernameTaken(String username) {
        for (User u : listUser) {
            if (u.getUsername().equals(username)) return true;
        }
        return false;
    }
    
    private static void login() {
        System.out.println("\n-------------------------");
        System.out.println("Login");

        System.out.print("Masukkan Username: ");
        String username = sc.nextLine().trim();

        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user.getUsername().equals(username)){
                userIndex = i;
                break;
            }
        }
           
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            /*
             * TODO
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */

            // Jika passwordnya sama maka berhasil login
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");

                Profile p = listProfile.get(userIndex);
                showProfile(p);
                /*
                 * TODO
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 * 
                 */
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        }else{
            System.out.println("Username tidak ditemukan");
        }
    }

    private static void showProfile(Profile p) {
        System.out.println("SELAMAT DATANG !!");
        System.out.println("Nama Lengkap : " + p.getFullName());
        System.out.println("Nama Panggilan : " + p.getNickName());
        System.out.println("Umur : " + p.getAge());
        System.out.println("Hobby : " + p.getHobby());
    }

}
