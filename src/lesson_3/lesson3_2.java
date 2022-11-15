package lesson_3;

import java.util.ArrayList;
import java.util.Arrays;


public class lesson3_2 {

    public static void main(String[] args)
    {
        // initializing array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.print("Array before removing even numbers: ");
        printArray(arr);
        int[] result = removeEven(arr);
        // print the array
        System.out.print("\nArray after removing even numbers: ");
        printArray(result);
    }
    public static void printArray(int[] result)
    {
        for (int i : result)
            System.out.print(i + " ");
    }
    public static int[] removeEven(int[] arr)
    {
        int odd_count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                odd_count++;
            }
        }

        int[] result = new int[odd_count];
        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}
