import java.util.*;

public class bbs {

  static class bubbleSort {

    void bubbleSort(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) for (int j = 0; j < n - i - 1; j++) if (
        arr[j] > arr[j + 1]
      ) {
        // swap arr[j+1] and arr[j]
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }

    void printArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
      System.out.println();
    }

    public static void main(String args[]) {
      bubbleSort ob = new bubbleSort();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int size;
      int[] arr;
      size = sc.nextInt();
      arr = new int[size];
      System.out.println("Enter " + size + " elements of the array: ");
      for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
      }
      ob.bubbleSort(arr);
      System.out.println("Sorted array: ");
      ob.printArray(arr);
    }
  }
}
