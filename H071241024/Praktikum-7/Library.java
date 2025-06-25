import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private LibraryLogger logger;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
        logger = new LibraryLogger();
    }

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.getTitle() + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) {
        return items.stream()
        .filter(it -> it.getItemId() == itemId)
        .findFirst()
        .orElseThrow(() -> new NoSuchElementException("Item dengan ID " + itemId + " tidak ditemukan"));
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public Member findMemberById(int memberId) {
        return members.stream()
        .filter(m -> m.getMemberId() == memberId)
        .findFirst()
        .orElseThrow(() -> new NoSuchElementException("Member dengan ID " + memberId + " tidak ditemukan"));
    }

    public String getLibraryStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("+------+----------------+---------+%n"));
        sb.append(String.format("| ID   | Judul          | Status  |%n"));
        sb.append(String.format("+------+----------------+---------+%n"));
        for (LibraryItem it : items) {
            sb.append(String.format("| %-4d | %-14s | %-7s |%n",
                    it.getItemId(), it.getTitle(), it.isBorrowed() ? "Dipinjam" : "Tersedia"));
        }
        sb.append(String.format("+------+----------------+---------+%n"));
        return sb.toString();
    }

    public String getAllLogs() {
        return logger.getLogs();
    }

    public LibraryLogger getLogger() {
        return logger;
    }
}

