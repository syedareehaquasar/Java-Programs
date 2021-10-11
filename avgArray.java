import java.util.Scanner;

public class avgArray {

  public static void main(String[] args) {
    double[] arr = new double[4];
    double total = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 4 elements for which you want to calculate average: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextDouble();
      total = total + arr[i];
    }

    double average = total / arr.length;

    /*
     * This is used for displaying the formatted output if you give %.4f then the
     * output would have 4 digits after decimal point.
     */
    System.out.format("The average is: %.3f", average);
  }
}
