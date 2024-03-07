package Belajar;

public class BelajarFunction {

    public static void sayHello(String name, String kabar){
        System.out.println("Hello World. Saya " + name +". "+ kabar);

        if (name=="Toko"){
            System.out.println("Alhamdulillah");
        }
    }

    public static int jumlah (int x, int y) {
        return x+y;
    }

    public static void main(String[] args) {
        String Diar = "Diar";
        String kabarDiar = "Im very happy right now.";
        sayHello(Diar, kabarDiar);
        sayHello("Toko", "Saya baik-baik saja saat ini.");
        System.out.println(jumlah(5,5));
    }
}
