package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        char[] arr = new char[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next().charAt(0);
        }
        System.out.print("Reversed symbols: [");
        for (int i = arr.length-1; i >= 0; i--) {
            if(i==0){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
