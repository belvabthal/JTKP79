package Materi345;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kampus polban = new Kampus("Politeknik Negeri Bandung");

        System.out.print("Masukkan nama lengkap pendaftar 1: ");
        StringTokenizer tokenizer = new StringTokenizer(input.nextLine());
        StringBuffer namaBuffer = new StringBuffer();
        while (tokenizer.hasMoreTokens()) {
            namaBuffer.append(tokenizer.nextToken()).append(" ");
        }

        float[] nilai1 = new float[]{85, 87, 90, 88, 84, 86};
        Mahasiswa m1 = new MahasiswaReguler(namaBuffer.toString().trim(), "Teknik Informatika", nilai1, "SMA 1 Bandung");

        StringBuilder namaBuilder = new StringBuilder();
        System.out.print("Masukkan nama lengkap pendaftar 2: ");
        namaBuilder.append(input.nextLine());

        float[] nilai2 = new float[]{90, 92, 91, 89, 93, 90};
        Mahasiswa m2 = new MahasiswaBeasiswa(namaBuilder.toString(), "Teknik Elektro", nilai2, "Bidikmisi");

        polban.tambahPendaftar(m1);
        polban.tambahPendaftar(m2);

        polban.cetakHasil();
    }
}
