import java.util.Scanner;

public class ls {

  static  class linearSearch {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr;
      int key, size, flag = 0;
      System.out.println("Enter the size of the array: ");
      size = sc.nextInt();
      arr = new int[size];
      System.out.println("Enter " + size + " elements of the array: ");
      for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("Enter the number to be searched: ");
      key = sc.nextInt();
      for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
          flag = 1;
          break;
        }
      }
      if (flag == 1) System.out.println(
        "Element is found!!!"
      ); else System.out.println("Number is not present in the array");
    }
  }
}
