package Tugas;

public class FaktorBilangan {
    public static void main(String[] args) {

        int bilangan = 20;
        int[] factors = new int[bilangan]; //ukuran array faktor sesuai nilai bilangan
        int count = 0;


        // menemukan faktor dan memasukkan ke array
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                factors[count++] = i;
            }
        }

        // Print dari urutan terbalik
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(factors[i]);

        }
    }
}