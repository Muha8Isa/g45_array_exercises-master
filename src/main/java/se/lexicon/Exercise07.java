package se.lexicon;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {
    System.out.println("\n" + "_______________");
    int[] arrai = new int[10];
    arrai[0] = 1; arrai[1] = 2; arrai[2] = 4; arrai[3] = 7; arrai[4] = 11;
    arrai[5] = 12; arrai[6] = 15; arrai[7] = 22; arrai[8] = 23; arrai[9] = 33;
    for (int i=0; i < arrai.length; i++)
      if( arrai[i] %2  != 0){
        System.out.print(arrai[i] + " ");
      }

  }

}
