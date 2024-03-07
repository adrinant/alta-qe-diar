package Tugas;

import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai Siswa = ");
        int nilaiSiswa = scanner.nextInt();

        if (nilaiSiswa >= 80 && nilaiSiswa <= 100) {
            System.out.println("A");
        } else if (nilaiSiswa >= 65) {
            System.out.println("B+");
        } else if (nilaiSiswa >= 50) {
            System.out.println("B");
        } else if (nilaiSiswa >= 35) {
            System.out.println("C");
        } else if (nilaiSiswa >= 0) {
            System.out.println("D");
        } else {
            System.out.println("invalid");
        }

    }
}
