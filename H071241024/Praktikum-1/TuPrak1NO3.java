import java.util.Scanner;

public class TuPrak1NO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String tanggal = scanner.nextLine();

            String[] pisahan = tanggal.split("-");
            int hari = Integer.parseInt(pisahan[0]);
            if (hari > 31) {
                System.out.println("Tanggal tdk valid");
                scanner.close();
                return;
            }
            int bulan = Integer.parseInt(pisahan[1]);
            if (bulan > 12) {
                System.out.println("Bulan tidak valid");
                scanner.close();
                return;
            }
            int tahun = Integer.parseInt(pisahan[2]);

            String[] BulanBulan = {
                    "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober",
                    "November", "Desember"
            };
            if (tahun <= 25) {
                tahun += 2000;
            } else {
                tahun += 1900;
            }
            String BulanTerpakai = (BulanBulan[bulan - 1]);

            System.out.println(hari + " " + BulanTerpakai + " " + tahun);
        } catch (Exception e) {
            System.out.println("harus dengan format yang benar");
        } finally {
            scanner.close();
        }
    }
}
