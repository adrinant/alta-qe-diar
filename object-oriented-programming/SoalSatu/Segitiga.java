package OOP.SoalSatu;

public class Segitiga {

    //atribut
    double alas;
    double tinggi;
    double c;

    public Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungKeliling(){
        double c = Math.sqrt(alas*alas + tinggi*tinggi);
        return alas+tinggi+c;
    }

    public double hitungLuas(){
        return (alas*tinggi)/2;
    }

}
