package Day2;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void print(int arr[]){
        for (int i=0;i < arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void reverseArray() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter total numbers of elements :");
        int num = scr.nextInt();
        int[]arr = new int[num];
        System.out.println("Enter elements");
        for(int i=0;i< arr.length;i++){
            arr[i]= scr.nextInt();
        }
        for(int i=0;i<arr.length/2;i++){
            int temp =arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("Here is the reversed Array");
        print(arr);
        System.out.println();
        }
    }

