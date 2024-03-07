package OOP.SoalSatu;

public class PersegiPanjang {
    //atribut
    float p;
    float l;

    public PersegiPanjang(float panjang, float lebar){
        this.p = panjang;
        this.l = lebar;
    }

    public float hitungKeliling(){
        return 2*(p+l);
    }

    public float hitungLuas(){
        return p*l;
    }
}
