package Materi345;

class MahasiswaReguler extends Mahasiswa {
    private String asalSekolah;

    public MahasiswaReguler(String nama, String jurusan, float[] nilaiSemester, String asalSekolah) {
        super(nama, jurusan, nilaiSemester);
        this.asalSekolah = asalSekolah;
    }

    @Override
    public float hitungNilaiAkhir() {
        float total = 0;
        for (float n : nilaiSemester) total += n;
        return total / nilaiSemester.length;
    }

    public String getAsalSekolah() { return asalSekolah; }
}