import java.util.Scanner;

public class konversitanggal {
    public static String ubahTanggal(String tanggal) {
        String[] parts = tanggal.split("-");
        int hari = Integer.parseInt(parts[0]);
        int bulan = Integer.parseInt(parts[1]);
        int tahun = Integer.parseInt(parts[2]);

        if ( hari > 31 ) {
            return "Tanggal tidak valid";
        } 
        
        if ( bulan > 12 ){
            return "Bulan tidak valid";
        }
        
        tahun += (tahun >= 0 && tahun <= 49) ? 2000 : 1900;
        
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        return hari + " " + namaBulan[bulan - 1] + " " + tahun;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String inputString = x.nextLine();
        x.close();
        
        System.out.println("Output: " + ubahTanggal(inputString));
    }
}