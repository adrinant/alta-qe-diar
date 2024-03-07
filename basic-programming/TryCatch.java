package Belajar;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Meminta pengguna untuk memasukkan angka
            System.out.print("Masukkan angka: ");
            int angka = scanner.nextInt();

            // Menampilkan angka yang dimasukkan pengguna
            System.out.println("Angka yang dimasukkan: " + angka);
        } catch (Exception e) {
            // Menangani pengecualian jika pengguna memasukkan sesuatu yang bukan angka
            System.out.println("Maaf, masukan tidak valid. Pastikan Anda memasukkan angka.");
        } finally {
            // Blok finally akan selalu dieksekusi, baik pengecualian terjadi atau tidak
            // Biasanya digunakan untuk membersihkan sumber daya seperti scanner
            scanner.close();
        }

    }
}



