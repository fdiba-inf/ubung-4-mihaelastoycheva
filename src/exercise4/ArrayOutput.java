package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        int[] array = new int[size];
        //System.out.println("Enter numbers: ");

        for (int index = 0; index < size; index++){
            array[index] = input.nextInt();
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println(array[i]);
        }

    }
}
