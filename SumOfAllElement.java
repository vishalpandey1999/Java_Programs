package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Sum{
    int SumOfElement(int[] arr){
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
}

public class SumOfAllElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum sum = new Sum();
        System.out.print("Enter Size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter Element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array: "+ Arrays.toString(arr));
        int ans = sum.SumOfElement(arr);
        System.out.println("Sum of All Array Element: "+ans);
    }
}
