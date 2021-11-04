package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        int[] array = new int[size];
        //System.out.println("Enter numbers: ");

        for (int index = 0; index < array.length; index++){
            array[index] = input.nextInt();
        }

        String numbers = Arrays.toString(array);
        System.out.println("Numbers: " + numbers);

    }
}
