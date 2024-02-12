package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Remove{
    int[] removeArray(int[] arr, int k){
        int newSize = 0;
//        for getting size of new array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != k){
              newSize++;
            }
        }
        int[] result = new int[newSize];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != k){
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}

public class Remove_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remove rmo = new Remove();

        System.out.print("enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter element of Array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        System.out.println("Array Before removing: "+ Arrays.toString(arr)+" ");
        System.out.print("Array after removing: "+ Arrays.toString(rmo.removeArray(arr, target))+" ");
    }
}
