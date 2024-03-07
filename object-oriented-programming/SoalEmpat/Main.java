package OOP.SoalEmpat;

public class Main {
    public static void main(String[] args) {
        JNE cust1 = new JNE(5,2,4,1); //vol kurang dari 50 berat = 1
        JNE cust2 = new JNE(5,2,4,0.4); // vol kurang dari 50 berat kurang dari 1
        JNE cust3 = new JNE(5,2,6,1); // vol lebih dari 50 berat = 1
        JNE cust4 = new JNE(5,2,7,0.4); // vol lebih dari 50 berat kurang dari 1
        JNE cust5 = new JNE(5,2,6,2); // vol lebih dari 50 berat lebih dari 1

        System.out.println("Harga : Rp "+cust1.hitungOngkir());
        System.out.println("Harga : Rp "+cust2.hitungOngkir());
        System.out.println("Harga : Rp "+cust3.hitungOngkir());
        System.out.println("Harga : Rp "+cust4.hitungOngkir());
        System.out.println("Harga : Rp "+cust5.hitungOngkir());
    }
}
