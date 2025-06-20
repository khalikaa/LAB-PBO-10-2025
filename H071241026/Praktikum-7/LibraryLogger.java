import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LibraryLogger {
    private List<String> logs = new ArrayList<>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public String logActivity(String activity) {
        String timestamp = LocalDateTime.now().format(formatter); //mengambil waktu
        String entry = timestamp + " " + activity;
        logs.add(entry);  //Menyimpan catatan ke dalam daftar log
        return entry;
    }

    public String getLogger() {
        return String.join("\n", logs); //Mengembalikan semua log sebagai satu string panjang dengan pemisah baris
    }

    public List<String> getLogs() { //Mengembalikan daftar log dalam bentuk list (array list of string
        return logs;
    }

    public void clearLogs() { //Menghapus semua log dari daftar
        logs.clear();
    }
}