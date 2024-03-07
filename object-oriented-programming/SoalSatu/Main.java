package OOP.SoalSatu;

import OOP.SoalDua.Balok;

public class Main {
    public static void main(String[] args) {
        //inisialisasi objek bernama persegi1 berdasarkan kelas persegi
        Persegi persegi1 = new Persegi(4);
        PersegiPanjang persegipanjang1 = new PersegiPanjang(7,8);
        Segitiga segitiga1 = new Segitiga(3,4);

        System.out.println("Luas");
        System.out.println("Persegi: " + persegi1.hitungLuas());
        System.out.println("Segitiga: " + segitiga1.hitungLuas());
        System.out.println("Persegi Panjang: " + persegipanjang1.hitungLuas());
        System.out.println("");
        System.out.println("Keliling");
        System.out.println("Persegi: " + persegi1.hitungKeliling());
        System.out.println("Segitiga: " + segitiga1.hitungKeliling());
        System.out.println("Persegi Panjang: " + persegipanjang1.hitungKeliling());
    }
}
