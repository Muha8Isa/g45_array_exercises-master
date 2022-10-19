package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   * France Paris
   * Sweden Stockholm
   */
  public static void ex5() {
    System.out.println("\n");
    System.out.println("----------------");
    String[][] cC = new String[2][2];
    cC[0][0] = "France";
    cC[0][1] = "Paris";

    cC[1][0] = "Sweden";
    cC[1][1] = "Stockholm";

    for (int i = 0; i < cC.length; i++) {

      for (int j = 0; j < cC[i].length; j++) {
        System.out.print(cC[i][j] + "\t");
      }
      System.out.println("\n");

    }

  }
}
