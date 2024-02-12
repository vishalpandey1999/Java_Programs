package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Question{
    int[] ReverseElement(int[]arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n - 1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    int[] ReverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question Que = new Question();

        System.out.print("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter Element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Reverse: "+ Arrays.toString(arr));
        int[] ans = Que.ReverseArray(arr);
        System.out.print("Array After Reversing: "+Arrays.toString(ans));
    }
}
