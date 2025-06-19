import java.util.*;

public class Member {
    private String name;
    private int memberId;
    private List<LibraryItem> borrowedItems = new ArrayList<>();  //Menyimpan daftar item yang sedang dipinjam

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }
    // Cek apakah item sudah dipinjam
    public String borrow(LibraryItem item, int days) {
        if (item.getIsBorrowed()) {
            throw new IllegalStateException("Item tidak tersedia"); // Jika sudah, lempar exception agar tidak bisa dipinjam lagi
        }
        String result = item.borrowItem(days);
        borrowedItems.add(item); //tambah item ke daftar item yg telah dipinjam
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        String result = item.returnItem();
        borrowedItems.remove(item); //Menghapus item dari daftar pinjaman karena sudah dikembalikan
        double fine = item.calculateFine(daysLate);
        return "Item " + item.getTitle() + " berhasil dikembalikan dengan denda: Rp " + (int) fine;
    }

    public void getBorrowedItems() {
        if (borrowedItems.isEmpty()) { //pengecek koleksi
            System.out.println("Belum meminjam item apa pun.");
            return;
        }

        System.out.println("+------------+----------------------+");
        System.out.println("|  ID Item   |        Judul         |");
        System.out.println("+------------+----------------------+");
        for (LibraryItem item : borrowedItems) {  // Iterasi dan tampilkan setiap item yang dipinjam
            System.out.printf("| %-10s | %-20s |\n", item.getItemId(), item.getTitle());
        }
        System.out.println("+------------+----------------------+");
    }

    public String getName() {
        return name;
    }
}