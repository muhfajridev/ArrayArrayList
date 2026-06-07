/*
 * Nama : [M. Fajri]
 * NPM  : [2410010523]
 */
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 4. Menyimpan daftar mata kuliah menggunakan Array String
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Basis Data", "Struktur Data"};
        System.out.println("Daftar Mata Kuliah Semester Ini:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Inisialisasi pengelola kelas kuliah
        KelasKuliah kelas = new KelasKuliah();

        // 5. Menambah minimal 5 objek Mahasiswa awal
        kelas.tambahMahasiswa(new Mahasiswa("Alice", "23010101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Bob", "23010102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Charlie", "23010103", 72.0));
        kelas.tambahMahasiswa(new Mahasiswa("David", "23010104", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Emma", "23010105", 90.0));

        // Tampilkan data mahasiswa awal
        System.out.println("Data Mahasiswa Awal:");
        kelas.tampilkanSemua();

        // Menampilkan rata-rata dan jumlah kelulusan awal
        System.out.printf("Rata-rata Nilai Kelas   : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
        System.out.println();

        // 6. Menambahkan satu mahasiswa baru ke dalam koleksi
        System.out.println("--- Menambahkan 1 Mahasiswa Baru ---");
        kelas.tambahMahasiswa(new Mahasiswa("Farhan", "23010106", 65.0));
        System.out.println();

        // Menampilkan kembali data terbaru
        System.out.println("Data Mahasiswa Terbaru:");
        kelas.tampilkanSemua();
        System.out.printf("Rata-rata Nilai Terbaru : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
    }
}