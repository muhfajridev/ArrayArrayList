package bagian3.perpustakaan;
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    System.out.println("Buku '" + judul + "' sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println("Buku '" + judul + "' berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // ====================================================================
    // SOAL 1: Method kembalikanBuku(String judul)
    // ====================================================================
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            // Mencari buku berdasarkan judul (mengabaikan huruf besar/kecil)
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    b.setDipinjam(false); // Mengubah status menjadi tidak dipinjam
                    System.out.println("Buku '" + judul + "' berhasil dikembalikan.");
                } else {
                    System.out.println("Buku '" + judul + "' sebenarnya tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan di perpustakaan.");
    }

    // ====================================================================
    // SOAL 3: Method cariPenulis(String penulis)
    // ====================================================================
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Buku Karya: " + penulis + " ==");
        boolean ditemukan = false;
        
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.getJudul() + " (" + b.getTahunTerbit() + ")");
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ditemukan buku dari penulis tersebut.");
        }
    }
}