
import java.util.Scanner;

public class TestScores {
  public static void main(String[] args) {
        //Test Score Numbers
        final int Array = 10;
        int[] Number = new int[Array];
        //Input Values
        Input(Number);
        //Methods
        GetTotal(Number);
        GetAverage(Number);
        Invalid(Number);
        Invalid2(Number);

    }

    public static void Input(int[] array) {
    Scanner keyboard = new Scanner(System.in);
        //Print Array
        System.out.println("Enter 10 test scores. ");
        for (int index = 0; index < array.length; index++) {
            
        //Print Number
        System.out.print("Enter test score " + (index + 1));
        array[index] = keyboard.nextInt();
        
        
        }
    }

    //Get Total
    public static double GetTotal(int[] x) {
        int Total = 0;
        for (int index = 0; index < x.length; index++) {
            Total += x[index];
        }
        //Print Total
        System.out.println("The total number is: " + Total);
        return Total;
    }

    //Get Average
    public static double GetAverage(int[] x) {
        int Total = 0;
        for (int index = 0; index < x.length; index++) {
            Total += x[index];
        }
        int Average = (Total / 2);
        //Print Average
        System.out.println("The average number is: " + Average);
        return Average;
    }

    //If Test Score is over 100 or Negative
    public static double Invalid(int[] x) {
        int Invalid = x[100];
        for (int index = 1; index < x.length; index++) {
            if (x[index] > Invalid) {
                Invalid = x[index];
            }
        }
        //Print Invalid
        System.out.println("Invalid Test Score");
        return Invalid;
    }   
    
    //If Test Score is over 100 or Negative
    public static double Invalid2 (int[] x) {
        int Invalid2 = x[0];
        for (int index = 1; index < x.length; index++) {
            if (x[index] < Invalid2) {
                Invalid2 = x[index];
            }
        }
        //Print Invalid
        System.out.println("Invalid Test Score");
        return Invalid2;
    }  
}
