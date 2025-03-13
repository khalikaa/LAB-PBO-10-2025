import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String inputDate = scanner.nextLine();

        String[] months = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };


        try {
            String[] parts = inputDate.split("-");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            if (day > 31){
                System.out.println("Tanggal tidak sesuai");
            
            }else{
            
            if (year >= 0 && year <= 25  ){
                year += 2000;

            }else {
                year += 1900;
            }
            if (month < 1 || month > 12) {
                throw new Exception();

            }
            System.out.println(day + " " + months[month - 1] + " " + year); }
        } catch (Exception e) {
            System.out.println("Format salah! Gunakan dd-mm-yy.");

        }
    }
}

  