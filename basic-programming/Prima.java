package Tugas;

public class Prima {

    public static boolean primeNumber(int number){
        //kondisi untuk mengecek apakah angka <=1
        if(number<=1){
            return false;
        }

        //loop untuk mencari dan menentukan bilangan prima, bilangan prima adalah bilangan yang hanya habis dibagi oleh 1 dan dirinya sendiri
        //misal number=7, 7 akan dibagi oleh 1,2,3
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        //kalau loop selesai tanpa menemukan kondisi mod = 0, maka return true yang berarti angka itu adalah bilangan prima
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(2));
        System.out.println(primeNumber(1));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));

    }
}
