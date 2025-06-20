import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int memberId;
    private List<LibraryItem> borrowedItems;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String borrow(LibraryItem item, int days) {
        if (item.isBorrowed()) {
            throw new IllegalStateException("Item tidak tersedia (sudah dipinjam)");
        }
        String result = item.borrowItem(days);
        borrowedItems.add(item);
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        if (!borrowedItems.remove(item)) {
            throw new IllegalStateException("Item ini tidak ada di daftar pinjaman");
        }
        String ret = item.returnItem();
        double fine = item.calculateFine(daysLate);
        return "item " + ret + " berhasil dikembalikan dengan denda: Rp " + String.format("%.0f", fine);
    }

    public String getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            return "Tidak ada item yang dipinjam";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("+------+----------------+%n"));
        sb.append(String.format("| ID   | Judul          |%n"));
        sb.append(String.format("+------+----------------+%n"));

        for (LibraryItem it : borrowedItems) {
            sb.append(String.format("| %-4d | %-14s |%n", it.getItemId(), it.getTitle()));
        }
        sb.append(String.format("+------+----------------+%n"));
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}


