package Materi345;

class MahasiswaBeasiswa extends Mahasiswa {
    private String namaBeasiswa;

    public MahasiswaBeasiswa(String nama, String jurusan, float[] nilaiSemester, String namaBeasiswa) {
        super(nama, jurusan, nilaiSemester);
        this.namaBeasiswa = namaBeasiswa;
    }

    @Override
    public float hitungNilaiAkhir() {
        float total = 0;
        for (float n : nilaiSemester) total += n;
        return (total / nilaiSemester.length) + 5; // bonus nilai dari beasiswa
    }

    public String getNamaBeasiswa() { return namaBeasiswa; }
}
