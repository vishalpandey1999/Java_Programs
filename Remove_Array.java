package Arrays;

public class Remove_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9};
        int[] arr2 = new int[arr.length / 2]; // Since you're removing half of the elements, arr2 should be half the length of arr
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                continue; // Skip even-indexed elements
            }
            arr2[k] = arr[i];
            k++;
        }

        // Print the elements in arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
