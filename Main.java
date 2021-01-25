import java.io.Console;

class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    // Total amount
    int total;
    // create variables for the MnMs found
    double fBlue, fRed, fBrown, fGreen, fYellow, fOrange;
    // assign values to the variables
    total = 55 * 9;
    fBlue = total * .24;
    fRed = total * .13;
    fBrown = total * .13;
    fGreen = total * .16;
    fYellow = total * .14;
    fOrange = total * .20;
    // print results
    System.out.println("Blue " + fBlue);
    System.out.println("Red " + fRed);
    System.out.println("Brown " + fBrown);
    System.out.println("Yellow " + fYellow);
    System.out.println("Green" + fGreen);
    System.out.println("Orange" + fOrange);
    // Sum variables
    double newTotal = fRed + fBlue + fBrown + fYellow + fGreen + fOrange;
    System.out.println("Sum " + newTotal);
    // If Statements
    /*
     * if ( blue IS GREATER THAN brown AND green IS GREATER THAN red) PRINT OUT
     * "Blue over Brown and Green over Red"; if ( brown IS LESS THAN OR EQUAL TO
     * orange) PRINT OUT "Brown is less than or equal to Orange"; if ( sum IS EQUAL
     * TO total) PRINT OUT "Numbers match";
     */
    if (fBlue > fBrown && fGreen > fRed) {
      System.out.println("Blue over Brown and Green over Red");
    }

    if (fBrown <= fOrange) {
      System.out.println("Brown is less than or equal to Orange");
    }

    if (newTotal == total) {
      System.out.println("Numbers match");
    }
  }
}