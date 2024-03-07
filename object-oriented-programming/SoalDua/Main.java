package OOP.SoalDua;

public class Main {
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(10);
        Balok balok1 = new Balok(3,6,10);
        Tabung tabung1 = new Tabung(7,10);

        System.out.println("Volume");
        System.out.println("Kubus : " + kubus1.hitungVolume());
        System.out.println("Balok : " + balok1.hitungVolume());
        System.out.println("Tabung: " + tabung1.hitungVolume());
    }
}
