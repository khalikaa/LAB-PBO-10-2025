public class DVD extends LibraryItem {
    private int duration;
    private static final int MAX_DAYS = 7;
    private static final double FINE_PER_DAY = 25000;

    public DVD (String title, int itemId, int duration) {
        super(title, itemId);
        this.duration = duration;
    }

    @Override
    public String getDescription() {
        return "DVD: " + title + ", durasi " + duration + " menit, ID: " + itemId;
    }
    
    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("Item telah dipinjam dan belum dikembalikan");
        } if (days > MAX_DAYS) {
            throw new IllegalArgumentException("Melebihi batas peminjaman " + days + " hari");
        } isBorrowed = true;
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * FINE_PER_DAY;
    }
}