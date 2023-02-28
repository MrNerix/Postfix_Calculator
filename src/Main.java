import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Token> myInts = new ArrayList<Token>();
        Calculator calculator = new Calculator();
        Scanner sc= new Scanner(System.in);
        boolean quit = false;
        String str;

        System.out.println("In order to finish type the letter q.");
        System.out.println("Enter an operand: ");
        str = sc.nextLine();
        myInts.add(new Operand(Integer.parseInt(str)));
        while(quit != true) {

            System.out.print("Enter an operand: ");
            str = sc.nextLine();

            if(str.equals("q"))
            {
                quit = true;
            }else{
                myInts.add(new Operand(Integer.parseInt(str)));
                System.out.print("Enter an operator: ");
                str = sc.nextLine();
                if(str.equals("q"))
                {
                    quit = true;}
                else{
                    myInts.add(new Operator(str));
                }
            }
        }
        System.out.println( "Calculator evaluate expression: " + calculator.evaluateExpression(myInts));
        System.out.println( "Calculator Result: " + calculator.getResult());
    }
}