package tugas;
import java.util.ArrayList;

public class KelasKuliah {
    private final ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int lulusCount = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                lulusCount++;
            }
        }
        return lulusCount;
    }

    public void tampilkanSemua() {
        System.out.println("================================================");
        System.out.printf("%-15s %-15s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("================================================");
        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s %-15s %-10.2f %-10s\n", m.getNpm(), m.getNama(), m.getNilai(), status);
        }
        System.out.println("================================================");
    }
}