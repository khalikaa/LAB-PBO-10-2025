public class Book extends LibraryItem {
    private String author; //atribute tambahan

    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Buku: " + title + "oleh" + author + ", ID: " + itemId;
    }

    @Override
    public String borrowItem(int days) {  //menghitung lama waktu meminjam.
        if (isBorrowed)
            throw new IllegalArgumentException("Item sudah dipinjam dan belum dikembalikan.");
        if (days > 14)
            throw new IllegalArgumentException("Buku hanya bisa dipinjam maksimal 14 hari.");
        isBorrowed = true;
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 10000; //menghitung denda keterlambatan
    }

    public String getDescription(String title) {
        return title;
    }
}