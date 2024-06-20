/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectdelmundo;
import java.util.*;

public class Main {
    static Scanner in = new Scanner (System.in);
    public static boolean checkReturn = false;
   
    public static void main(String[] args) {
       do{
           int option;
           System.out.println("1. Addition");
           System.out.println("2. Subtraction");
           System.out.println("3. Division");
           System.out.println("4. Multiplication");
           
           
           
           System.out.print("Enter Choice");
           option = in.nextInt();
           
           if(option == 1)
             {
              add();
             }
           else if (option == 2 )
           {
             
           }
           
           
           
           
       }while(checkReturn);
    }
    
    public static void add ()
            
    {
    CalculatorClass myCal = new CalculatorClass();
    float num1, num2;
    System.out.print("Enter num1: ");
    num1 = in.nextFloat();
    System.out.print("Enter num2: ");
    num2 = in.nextFloat();
    System.out.print("The Sum is "+myCal.addition(num1, num2));
    checkReturn = in.nextBoolean();
    
    }
    
    public static void subtract()
    {
    CalculatorClass myCal = new CalculatorClass();
    float num1, num2;
    System.out.print("Enter num1: ");
    num1 = in.nextFloat();
    System.out.print("Enter num2: ");
    num2 = in.nextFloat();
    System.out.print("The Sub is "+myCal.substraction(num1, num2));
    checkReturn = in.nextBoolean();
    }
    
    public static void division()
    {
    CalculatorClass myCal = new CalculatorClass();
    float num1, num2;
    System.out.print("Enter num1: ");
    num1 = in.nextFloat();
    System.out.print("Enter num2: ");
    num2 = in.nextFloat();
    System.out.print("The Div is "+myCal.division(num1, num2));
    checkReturn = in.nextBoolean();
    }
    
    public static void multiplication()
    {
    CalculatorClass myCal = new CalculatorClass();
    float num1, num2;
    System.out.print("Enter num1: ");
    num1 = in.nextFloat();
    System.out.print("Enter num2: ");
    num2 = in.nextFloat();
    System.out.print("The Multiply is "+myCal.multiplication(num1, num2));
    checkReturn = in.nextBoolean();
    }
}
