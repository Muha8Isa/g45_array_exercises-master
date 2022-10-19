package se.lexicon;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    int[] siffror = {43, 5, 23, 17, 2, 14};
    Arrays.sort(siffror);
    System.out.print("[");
    for (int siff : siffror) {
      System.out.print(siff + ", ");
    }
    System.out.print("\b\b"); // Two backspaces --> Remove 2 characters backwards:(, )
    System.out.println("]");
    // Average:
    double total = 0;
    for(int i=0; i<siffror.length; i++){
      total = total + siffror[i];
    }
    double average = total / siffror.length;

    DecimalFormat df = new DecimalFormat(); // Set only two digits after decimal.
    df.setMaximumFractionDigits(2);

    System.out.print(df.format(average));

  }

}
