package OOP.SoalDua;

public class Tabung {
    float radius;
    float tinggi;

    public Tabung(float radius, float tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public float hitungVolume(){
        return 22f/7f * radius * radius * tinggi;
    }
}
