package generic;

import java.util.Arrays;

public class GenericSort {

  private <E> void swap(E[] a, int i, int j) {
    if (i != j) {
      E temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }

  public <E extends Comparable<E>> void selectionSort(E[] a) {
      for (int i = 0; i < a.length - 1; i++) {
          // find index of smallest element
          int smallest = i;
          for (int j = i + 1; j < a.length; j++) {
              if (a[j].compareTo(a[smallest])<=0) {
                  smallest = j;
              }
          }

          swap(a, i, smallest);  // swap smallest to front
      }
  }

  public static void demoSort() {
    GenericSort genericSort = new GenericSort();

    Integer[] arr = {3,4,1,5};
    System.out.println("Before sorting int: "+ Arrays.toString(arr));
    genericSort.selectionSort(arr);
    System.out.println("After sorting int : " + Arrays.toString(arr));
    
    String[] arr1= {"acd","ded","dal","bad","cle"};
    System.out.println("Before sorting String: "+ Arrays.toString(arr1));
    genericSort.selectionSort(arr1);
    System.out.println("After sorting String : "+ Arrays.toString(arr1));
         
  }
}

