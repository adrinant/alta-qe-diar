package Belajar;

public class LampuTombol {
    public static void main(String[] args) {
       boolean lampuON = false;
       int jmlTombol = 5;
       int i = 1;
       while(i<=jmlTombol){
            if (jmlTombol%i==0){
                lampuON = !lampuON;
                i++;
            } else {
                i++;
            }
       }

       if(lampuON==true){
            System.out.println("Lampu menyala");
       } else {
            System.out.println("Lampu mati");
       }

    }
}
