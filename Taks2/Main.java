import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] arr = {5,6,3,2,5,1,4,9};
    bubbleSort(arr);
    for(int i = 0; i <  arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
  }

  public static void bubbleSort(int[] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }
  }
}


