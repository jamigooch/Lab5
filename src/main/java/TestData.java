
import java.util.Scanner;
public class TestData {
    public static void main(String[] args) {
        //Total, Average, Highest, Lowest
        final int Array = 4;
        int[] Number = new int[Array];
        //Input Values
        Input(Number);
        //Methods
        GetTotal(Number);
        GetAverage(Number);
        GetHighest(Number);
        GetLowest(Number);
    }

    public static void Input(int[] array) {
    Scanner keyboard = new Scanner(System.in);
        //Print Array
        System.out.println("Enter 4 numbers. ");
        for (int index = 0; index < array.length; index++) {
        //Print Number
        System.out.print("Enter number " + (index + 1));
        array[index] = keyboard.nextInt();
        }
    }

    //Get Total
    public static int GetTotal(int[] x) {
        int Total = 0;
        for (int index = 0; index < x.length; index++) {
            Total += x[index];
        }
        //Print Total
        System.out.println("The total number is: " + Total);
        return Total;
    }

    //Get Average
    public static int GetAverage(int[] x) {
        int Total = 0;
        for (int index = 0; index < x.length; index++) {
            Total += x[index];
        }
        int Average = (Total / 2);
        //Print Average
        System.out.println("The average number is: " + Average);
        return Average;
    }

    //Get Highest
    public static int GetHighest(int[] x) {
        int Highest = x[0];
        for (int index = 1; index < x.length; index++) {
            if (x[index] > Highest) {
                Highest = x[index];
            }
        }
        //Print Highest
        System.out.println("The highest number is: " + Highest);
        return Highest;
    }

    //Get Lowest
    public static int GetLowest(int[] x) {
        int Lowest = x[0];
        for (int index = 1; index < x.length; index++) {
            if (x[index] < Lowest) {
                Lowest = x[index];
            }
        }
        //Print Lowest
        System.out.println("The lowest number is: " + Lowest);
        return Lowest;
    }
}
