package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lengkap dengan tahun terbit (Soal No. 2)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya Ananta Toer", 1981));

        // 1. Tampilkan koleksi awal
        perpus.tampilkanKoleksi();
        System.out.println();

        // 2. Uji coba peminjaman buku
        System.out.println("--- Proses Peminjaman ---");
        perpus.pinjamBuku("Bumi Manusia");
        perpus.tampilkanKoleksi();
        System.out.println();

        // 3. Uji coba Fitur Pengembalian Buku (Soal No. 1)
        System.out.println("--- Proses Pengembalian ---");
        perpus.kembalikanBuku("Bumi Manusia");
        perpus.tampilkanKoleksi();
        System.out.println();

        // 4. Uji coba Fitur Pencarian Penulis (Soal No. 3)
        System.out.println("--- Proses Pencarian Penulis ---");
        perpus.cariPenulis("Pramoedya Ananta Toer");
        System.out.println();
        
        perpus.cariPenulis("Andrea Hirata");
    }
}