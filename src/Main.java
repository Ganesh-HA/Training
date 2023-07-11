import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for largest Number ");
            System.out.println("Enter 2 for Reverse String ");
            System.out.println("Enter 0 to Exit ");
            int x = scr.nextInt();
            switch (x) {
                case 0:
                    System.out.println("Exiting the Program..");
                    return;

                case 1:
                    System.out.println("Enter Total numbers : ");
                    int n = scr.nextInt();
                    int[] numbers = new int[n];
                    System.out.println("Enter the elements of the Array : ");
                    for (int i = 0; i < n; i++) {
                        numbers[i] = scr.nextInt();
                    }
                    int largest = numbers[0];
                    for (int i = 1; i < numbers.length; i++) {
                        if (numbers[i] > largest) {
                            largest = numbers[i];
                        }
                    }
                    System.out.println("The largest number in the array is :" + largest);
                    break;
                case 2:
                    scr.nextLine();
                    System.out.println("Enter a String : ");
                    String str = scr.nextLine();
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reversed += str.charAt(i);
                    }
                    System.out.println("Reversed String : " + reversed);
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        }
    }
}

