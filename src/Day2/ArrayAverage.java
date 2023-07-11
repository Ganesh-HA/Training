package Day2;

import java.util.Scanner;

public class ArrayAverage {
    public static void calculateAverage() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter total number of elements : ");
        float n = scr.nextFloat();
        float[] arr = new float[(int)n];
        System.out.println("Enter elements");
        int sum = 0;
        for (int i=0;i< arr.length;i++) {
            arr[i]= scr.nextInt();
            sum += arr[i];
        }
        float average= sum / n;
        System.out.println(("This the average of all the elements : "+ average));
    }
}
