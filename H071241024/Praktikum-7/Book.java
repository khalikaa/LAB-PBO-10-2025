public class Book extends LibraryItem {
    private String author;
    private static final int MAX_DAYS = 14;
    private static final double FINE_PER_DAY = 10000;

    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    public String getDescription() {
        return "Buku: " + title + " oleh " + author + ", ID: " + itemId;
    }
 
    public int getDescription(String waktu) {
        return 0;
    }

    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("Item telah dipinjam dan belum dikembalikan");
        } if (days > MAX_DAYS) {
            throw new IllegalArgumentException("Melebihi batas peminjaman " + days +  " hari");
        } isBorrowed = true;
        return "Item "+ title +"  berhasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * FINE_PER_DAY;
    }
}