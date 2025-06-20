import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {
        int choice = -1; //dipilih supaya loop bisa mulai jalan dan nunggu input user

        do {
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item Anggota");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");

            try {
                choice = Integer.parseInt(scanner.nextLine()); //ubah string jadi integer
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka.");
                continue;
            }

            switch (choice) {
                case 1 -> tambahItem();
                case 2 -> tambahAnggota();
                case 3 -> pinjamItem();
                case 4 -> kembalikanItem();
                case 5 -> library.getLibraryStatus();
                case 6 -> tampilkanLogAktivitas();
                case 7 -> lihatItemAnggota();
                case 8 -> System.out.println("Terima kasih telah menggunakan sistem.");
                default -> System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        } while (choice != 8);
    }

    private static void tambahItem() {
    try {
        int jenis = 0;
        while (true) {
            System.out.println("1. Buku");
            System.out.println("2. DVD");
            System.out.print("Pilih jenis item: ");
            try {
                jenis = Integer.parseInt(scanner.nextLine());
                if (jenis == 1 || jenis == 2) {
                    break;
                } else {
                    System.out.println("Jenis item tidak valid. Silakan pilih 1 atau 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid (1 atau 2).");
            }
        }

        System.out.print("Judul: ");
        String judul = scanner.nextLine();

        System.out.print("ID item: ");
        int id = Integer.parseInt(scanner.nextLine());

        LibraryItem item = null;

        if (jenis == 1) {
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            item = new Book(judul, id, penulis);
        } else {
            System.out.print("Durasi (menit): ");
            int durasi = Integer.parseInt(scanner.nextLine());
            item = new DVD(judul, id, durasi);
        }
        
        if (item != null) {
            System.out.println(library.addItem(item));
            
            // Tambahkan log aktivitas jika logger tersedia
            if (library.getLogger() != null) {
                library.getLogger().logActivity("Item " + item.getDescription() + " ditambahkan");
            }

        }
        
    } catch (NumberFormatException e) {
        System.out.println("Input angka tidak valid.");
    } catch (Exception e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    }
}

    private static void tambahAnggota() {
        try {
            int id;
            while(true)
                System.out.print("ID Anggota: ");
                id = Integer.parseInt(scanner.nextLine());

                if (library.findMemberById(id) != null) {
                    System.out.println("Id tersebut sudah digunakan oleh Item atau Anggota. Masukkan Id lain");
                } else if (library.findItemById(id) != null) {
                    System.out.println("Id ini sudah digunakan. Masukkan Id lainnya");
                } else {
                    break;
                }

            System.out.print("Nama Anggota: ");
            String nama = scanner.nextLine();

            Member m = new Member(nama, id);
            library.addMember(m);
            if (library.getLogger() != null)
                library.getLogger().logActivity("Anggota " + nama + " ditambahkan");

            System.out.println("Anggota berhasil ditambahkan");
        } catch (Exception e) {
            System.out.println("Gagal menambahkan anggota: " + e.getMessage());
        }
    }

    private static void pinjamItem() {
        try {
            System.out.print("ID Anggota: ");
            int idAnggota = Integer.parseInt(scanner.nextLine());

            System.out.print("ID Item: ");
            int idItem = Integer.parseInt(scanner.nextLine());

            System.out.print("Jumlah Hari: ");
            int hari = Integer.parseInt(scanner.nextLine());

            Member m = library.findMemberById(idAnggota);
            if (m == null) {
                System.out.println("Anggota tidak ditemukan.");
                return;
            }

            LibraryItem item = library.findItemById(idItem);
            if (item == null) {
                System.out.println("Item tidak ditemukan");
                return;
            }

            String result = m.borrow(item, hari);
            if (library.getLogger() != null)
                library.getLogger().logActivity(item.getDescription() + " dipinjam oleh " + m.getName());

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka");
        } catch (Exception e) {
            System.out.println("Gagal meminjam: " + e.getMessage());
        }
    }

    private static void kembalikanItem() {
        try {
            System.out.print("ID Anggota: ");
            int idAnggota = Integer.parseInt(scanner.nextLine());

            System.out.print("ID Item: ");
            int idItem = Integer.parseInt(scanner.nextLine());

            System.out.print("Jumlah hari keterlambatan: ");
            int telat = Integer.parseInt(scanner.nextLine());

            Member m = library.findMemberById(idAnggota);
            if (m == null) {
                System.out.println("Anggota tidak ditemukan");
                return;
            }

            LibraryItem item = library.findItemById(idItem);
            if (item == null) {
                System.out.println("Item tidak ditemukan");
                return;
            }

            //menyimpan pesan hasil pengembalian item ke dalam variabel result
            String result = m.returnItem(item, telat);
            if (library.getLogger() != null)
                library.getLogger().logActivity(item.getDescription() + " dikembalikan oleh " + m.getName());

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka");
        } catch (Exception e) {
            System.out.println("Gagal mengembalikan: " + e.getMessage());
        }
    }

    private static void lihatItemAnggota() {
        try {
            System.out.print("ID Anggota: ");
            int id = Integer.parseInt(scanner.nextLine());

            Member m = library.findMemberById(id);
            if (m != null) {
                m.getBorrowedItems();  // asumsi method ini sudah print daftar item
            } else {
                System.out.println("Anggota tidak ditemukan");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat mencari anggota: " + e.getMessage());
        }
    }

    private static void tampilkanLogAktivitas() {
        try {
            if (library.getLogger() == null) {
                System.out.println("Logger belum tersedia");
                return;
            }

            //mengambil daftar semua log (tipe List<String>) yang sudah dicatat
            List<String> logs = library.getLogger().getLogs();
            if (logs.isEmpty()) {
                System.out.println("Belum ada aktivitas");
            } else {
                System.out.println("=== Log Aktivitas ===");
                for (String log : logs) { //lakukan sesuatu
                    System.out.println("- " + log);
                }
            }
        } catch (Exception e) {
            System.out.println("Gagal menampilkan log: " + e.getMessage());
        }
    }
}
