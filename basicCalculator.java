package JAVA3;
import java.util.Scanner;
public class basicCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("enter the operator : ");
        String operator = sc.next();
        switch(operator){
            case "+" : {
                int c = a+b;
                System.out.println("The sum of a and b is " + c);
                break;
            }
            case "-" : {
                int c = a-b;
                System.out.println("The difference of a and b is " + c);
                break;
            }
            case "*" : {
                int c = a*b;
                System.out.println("The product of a and b is " + c);
                break;
            }
            case "/" : {
                int c = a/b;
                System.out.println("The division of a and b is " + c);
                break;
            }
            case "%" : {
                int c = a%b;
                System.out.println("The remainder of a and b is " + c);
                break;
            }
            default : {
                System.out.println("Invalid operator");
            }
        }
    }
}
