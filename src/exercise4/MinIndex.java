package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        double min = 12345;
        //System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        double[] array = new double[size];
        //System.out.println("Enter numbers: ");

        for (int index = 0; index < size; index++) {
            array[index] = input.nextInt();
            if (min > array[index]) {
                min = array[index];
                number = index;
            }
        }
        System.out.println("Min index: " + number);
    }
}
