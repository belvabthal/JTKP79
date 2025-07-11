package Materi345;

abstract class Mahasiswa {
    private String nama;
    private String jurusan;
    protected float[] nilaiSemester;

    public Mahasiswa(String nama, String jurusan, float[] nilaiSemester) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.nilaiSemester = nilaiSemester;
    }

    public String getNama() { return nama; }
    public String getJurusan() { return jurusan; }
    public void setNama(String nama) { this.nama = nama; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }

    public void setNilaiSemester(float[] nilai) {
        this.nilaiSemester = nilai;
    }

    public abstract float hitungNilaiAkhir();
}