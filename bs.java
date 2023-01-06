import java.util.Scanner;

public class bs {

  static class binarySearch {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[], key, l, r, mid, size, flag = 0;
      System.out.println("Enter the size of the array: ");
      size = sc.nextInt();
      arr = new int[size];
      System.out.println("Enter " + size + " elements of the array: ");
      for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("Enter the element to be searched:");
      key = sc.nextInt();
      l = 0;
      r = size - 1;
      while (l <= r) {
        mid = (l + r) / 2;
        if (arr[mid] == key) {
          System.out.println("Element is found!!!");
          flag = 1;
          break;
        } else if (arr[mid] > key) {
          r = mid - 1;
        } else if (arr[mid] < key) {
          l = mid + 1;
        }
      }
      if (flag == 0) System.out.println("Element is not present!!!");
    }
  }
}
