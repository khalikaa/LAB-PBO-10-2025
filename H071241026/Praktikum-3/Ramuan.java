public class Ramuan {
        String nama;
        String efek;
        int jumlah;
    
        public Ramuan() {
            this.nama = "Ramuan Tidak Diketahui";
            this.efek = "Tidak Ada Efek";
            this.jumlah = 0;
        }
    
        public Ramuan(String nama, String efek, int jumlah) {
            this.nama = nama;
            this.efek = efek;
            this.jumlah = jumlah;
        }
    
        public void infoRamuan() {
            System.out.println("Ramuan: " + nama);
            System.out.println("Efek  : " + efek);
            System.out.println("Jumlah: " + jumlah + " botol");
        }
    
        public void gunakan() {
            if (jumlah > 0) {                       //masih tersedia
                jumlah--;                           //kurangi 1 ramuan
                System.out.println("Ramuan " + nama + " digunakan!");
            } else {
                System.out.println("Ramuan " + nama + " habis!");
            }
        }
    }
