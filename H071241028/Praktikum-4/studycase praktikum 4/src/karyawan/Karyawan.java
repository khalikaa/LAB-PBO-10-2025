package karyawan;

public class Karyawan {
    private String nama;
    private final int id;
    private static int jumlahKaryawan = 0;

    public Karyawan(String nama, int id) {
        this.nama = nama;
        this.id = id;
        jumlahKaryawan++;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public static int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    public void naikPangkat() {
        jumlahKaryawan--;
        System.out.println("Karyawan " + nama + " telah jadi Intel, karyawan berkurang.");
    }
}
