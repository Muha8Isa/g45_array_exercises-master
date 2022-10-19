package se.lexicon;

import java.util.Arrays;

public class Exercise02 {

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */
  public static void ex2() {
    System.out.println("\n" + "------------------");

    int[] numbers = {1, 3, 5, 7, 9, 11};
    Arrays.sort(numbers);
    int index = Arrays.binarySearch(numbers, 5);
    if (index < 0) {
      System.out.println("Data not found");
    } else {
      System.out.println("Index position of number " + numbers[index] + " is " + index);
    }

  }



}
