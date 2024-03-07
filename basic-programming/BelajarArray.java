package Belajar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BelajarArray {
    public static void main(String[] args) {
        Integer[] arrayBilangan = {1,4,5,7,12};

        for(Integer i:arrayBilangan){
            System.out.println("Index array " + i);
        }

        Arrays.sort(arrayBilangan, Collections.reverseOrder());
        for (Integer j : arrayBilangan) {
            System.out.println(j + " ");
        }
    }
}
