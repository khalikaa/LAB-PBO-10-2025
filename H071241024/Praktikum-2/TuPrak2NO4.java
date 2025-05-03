
class Alamat {
    String jalan;
    String kota;

    public String toString(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;
    
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.toString();
    }
    
}

public class TuPrak2NO4{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";

        System.out.println("Nama : "+mahasiswa.getNama());
        System.out.println("Nim: "+mahasiswa.getNim());
        System.out.println("Alamat: "+mahasiswa.getAlamat());
    }
}