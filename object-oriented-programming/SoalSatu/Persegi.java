package OOP.SoalSatu;

public class Persegi {

    //atribut
    float sisi;

    //constructor
    public Persegi(float sisi){
        this.sisi = sisi;
    }

    //method untuk menghitung keliling persegi
    public float hitungKeliling(){
        return 4*sisi;
    }

    //method untuk menghitung luas persegi
    public float hitungLuas(){
        return sisi*sisi;
    }

}
