package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Question_2{
    int[] max_min(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i  = 1; i < arr.length; i++){
            int current = arr[i];
            if(current > max){
                max = current;
            }else if(current < min){
                min = current;
            }
        }
        return new int[]{max, min};
    }
}

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question_2 Q2 = new Question_2();

        System.out.print("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter Element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Print Array: "+ Arrays.toString(arr));
        int[] ans = Q2.max_min(arr);
        System.out.print("Max and Min : "+Arrays.toString(ans));
    }
}
