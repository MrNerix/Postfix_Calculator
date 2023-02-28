import java.util.ArrayList;


public class Calculator{

    Stack stack = new Stack<>();
    public int evaluateExpression(ArrayList<Token> tokenList){
        for(int i = tokenList.size() - 1; i != -1; i--){
            stack.push(tokenList.get(i).get());
        }
        int firstNumb;
        int secondNumb;

        for (int i = 1; (tokenList.size() - 1) / 2 >= i; i++ ) {

            try {
                firstNumb = Integer.parseInt(String.valueOf(stack.pop()));
                secondNumb = Integer.parseInt(String.valueOf(stack.pop()));
                if (stack.peek().equals("*")) {
                    stack.pop();
                    stack.push(firstNumb * secondNumb);
                } else if (stack.peek().equals("-")) {
                    stack.pop();
                    stack.push(firstNumb - secondNumb);
                }else if (stack.peek().equals("+")) {
                    stack.pop();
                    stack.push(firstNumb + secondNumb);
                } else if (stack.peek().equals("/")) {
                    stack.pop();
                    stack.push(firstNumb / secondNumb);
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        return Integer.parseInt(String.valueOf(stack.peek()));
    }
    public Object getResult(){
        return stack.peek();
    }
}
