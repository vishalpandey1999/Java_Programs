package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class FindNum{

    int findElement(int[] arr, int k){
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            if(i == k){
                return arr[i];
            }
        }
        return -1;
    }
}

public class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindNum fn = new FindNum();
        System.out.print("Enter Size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter Element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        System.out.println("Array: "+ Arrays.toString(arr));
        int ans = fn.findElement(arr, target);
        System.out.print("Find Element: "+ans);

    }
}
