import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice = 0;

        do {
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item yang Dipinjam Anggota");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); 
            } catch (InputMismatchException ime) {
                System.out.println("Input tidak valid");
                sc.nextLine(); 
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Jenis item (1: book, 2: dvd): ");
                        String type = sc.nextLine().trim();

                        if (!type.equals("1") && !type.equals("2")) {
                            System.out.println("Pilihan jenis tidak valid. Harus 1 atau 2.");
                            break;
                        }

                        System.out.print("Judul: ");
                        String title = sc.nextLine();

                        System.out.print("ID: ");
                        int id;
                        try {
                            id = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException ime) {
                            System.out.println("ID harus berupa angka.");
                            sc.nextLine();
                            break;
                        }

                        if (type.equals("1")) {
                            System.out.print("Author: ");
                            String auth = sc.nextLine();
                            System.out.println(lib.addItem(new Book(title, id, auth)));
                        } else {
                            System.out.print("Durasi (menit): ");
                            int dur;
                            try {
                                dur = sc.nextInt();
                                sc.nextLine();
                            } catch (InputMismatchException ime) {
                                System.out.println("Durasi harus berupa angka.");
                                sc.nextLine();
                                break;
                            }
                            System.out.println(lib.addItem(new DVD(title, id, dur)));
                        }

                        // Catat log
                        lib.getLogger().logActivity(title + " berhasil ditambahkan");
                        break;

                    case 2:
                        System.out.print("Nama anggota: ");
                        String name = sc.nextLine();

                        System.out.print("ID anggota: ");
                        int mid;
                        try {
                            mid = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException ime) {
                            System.out.println("ID anggota harus berupa angka.");
                            sc.nextLine();
                            break;
                        }

                        lib.addMember(new Member(name, mid));
                        System.out.println("Anggota berhasil ditambahkan");
                        lib.getLogger().logActivity("Anggota " + name + " ditambahkan");
                        break;

                    case 3:
                        System.out.print("ID anggota: ");
                        int amId;
                        try {
                            amId = sc.nextInt();
                        } catch (InputMismatchException ime) {
                            System.out.println("ID anggota harus angka.");
                            sc.nextLine();
                            break;
                        }

                        System.out.print("ID item: ");
                        int aiId;
                        try {
                            aiId = sc.nextInt();
                        } catch (InputMismatchException ime) {
                            System.out.println("ID item harus angka.");
                            sc.nextLine();
                            break;
                        }

                        System.out.print("Lama pinjam (hari): ");
                        int days;
                        try {
                            days = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException ime) {
                            System.out.println("Hari pinjam harus angka.");
                            sc.nextLine();
                            break;
                        }

                        Member m = lib.findMemberById(amId);
                        LibraryItem it = lib.findItemById(aiId);
                        String res = m.borrow(it, days);
                        System.out.println(res);
                        lib.getLogger().logActivity(it.getDescription()
                                + " dipinjam oleh " + m.getName());
                        break;

                    case 4:
                        System.out.print("ID anggota: ");
                        int rmId;
                        try {
                            rmId = sc.nextInt();
                        } catch (InputMismatchException ime) {
                            System.out.println("ID anggota harus angka.");
                            sc.nextLine();
                            break;
                        }

                        System.out.print("ID item: ");
                        int riId;
                        try {
                            riId = sc.nextInt();
                        } catch (InputMismatchException ime) {
                            System.out.println("ID item harus angka.");
                            sc.nextLine();
                            break;
                        }

                        System.out.print("Hari terlambat: ");
                        int late;
                        try {
                            late = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException ime) {
                            System.out.println("Hari terlambat harus angka.");
                            sc.nextLine();
                            break;
                        }

                        Member rm = lib.findMemberById(rmId);
                        LibraryItem rit = lib.findItemById(riId);
                        String rres = rm.returnItem(rit, late);
                        System.out.println(rres);
                        lib.getLogger().logActivity(rit.getTitle()
                                + "ID: " + riId + " oleh " + rm.getName());
                        break;

                    case 5:
                        System.out.println(lib.getLibraryStatus());
                        break;

                    case 6:
                        String logs = lib.getAllLogs();
                        if (logs.isBlank()) {
                            System.out.println("Tidak ada log aktivitas");
                        } else {
                            System.out.println("=== Log Aktivitas ===");
                            System.out.println(logs);
                        }
                        break;

                    case 7:
                        System.out.print("ID anggota: ");
                        int vId;
                        try {
                            vId = sc.nextInt();
                            sc.nextLine();
                        } catch (InputMismatchException ime) {
                            System.out.println("ID anggota harus angka.");
                            sc.nextLine();
                            break;
                        }
                        Member vm = lib.findMemberById(vId);
                        System.out.println(vm.getBorrowedItems());
                        break;

                    case 8:
                        System.out.println("Keluar...");
                        break;

                    default:
                        System.out.println("Opsi tidak valid");
                }
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);

        sc.close();
    }
}
