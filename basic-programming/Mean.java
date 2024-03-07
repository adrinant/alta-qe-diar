package Tugas;

import org.w3c.dom.ls.LSOutput;

public class Mean {

    private static float calculateMean(float [] numbers){
        float sum = 0;
        for(float num:numbers){
            sum += num;
        }
        return sum/numbers.length;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(calculateMean(value)); //2.5
        float[] value1 = {5, 11, 44, 22, 12};
        System.out.println(calculateMean(value1)); //18.8
    }
}

