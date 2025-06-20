public abstract class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isBorrowed;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isBorrowed = false;
    }

    public abstract String getDescription(); //mengembalikan deskripsi item
    public abstract String borrowItem(int days); //menghitung lama waktu meminjam
    public abstract double calculateFine(int daysLate); //menghitung denda keterlambatan.

    public String returnItem() {
        this.isBorrowed = false;
        return title + " dikembalikan";
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }
}
