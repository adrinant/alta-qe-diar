package OOP.SoalDua;

public class Balok {
    float panjang;
    float lebar;
    float tinggi;

    public Balok(float panjang, float lebar, float tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public float hitungVolume(){
        return panjang*lebar*tinggi;
    }
}
