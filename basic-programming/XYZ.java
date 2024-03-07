package Tugas;

public class XYZ {

    private static void DrawXYZ(int n){
        int angkaKe=1; //pointer
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if (angkaKe % 2 == 0) {
                    System.out.print("Z ");
                    angkaKe++;
                } else if (angkaKe % 3 == 0) {
                    System.out.print("X ");
                    angkaKe++;
                } else if (angkaKe % 2 != 0) {
                    System.out.print("Y ");
                    angkaKe++;
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        DrawXYZ(3);
        System.out.println();
        DrawXYZ(5);
        System.out.println();
        DrawXYZ(1);
    }
}
