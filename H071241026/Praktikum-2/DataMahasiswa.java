class Alamat {
    String jalan;
    String kota;

    public String getAlamat() {
        return jalan + ", " + kota;
    }
}
class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

}
public class DataMahasiswa {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jalan damai";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Natasya";
        mahasiswa.nim = "H071241026";

        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("Nim: " + mahasiswa.nim);
        System.out.println("Alamat: " + mahasiswa.alamat);
    }
}