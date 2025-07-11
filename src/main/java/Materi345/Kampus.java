package Materi345;

import java.util.ArrayList;

class Kampus implements Seleksi {
    private String namaKampus;
    private ArrayList<Mahasiswa> daftarLolos = new ArrayList<>();

    public Kampus(String namaKampus) {
        this.namaKampus = namaKampus;
    }

    public void tambahPendaftar(Mahasiswa mhs) {
        float nilaiAkhir = mhs.hitungNilaiAkhir();
        if (lolos(nilaiAkhir)) daftarLolos.add(mhs);
    }

    @Override
    public boolean lolos(float nilaiAkhir) {
        return nilaiAkhir >= 80;
    }

    public void cetakHasil() {
        System.out.println("\nMahasiswa yang lolos di " + namaKampus + ":");
        for (Mahasiswa m : daftarLolos) {
            System.out.println("- " + m.getNama() + " | Jurusan: " + m.getJurusan());
        }
    }
}