import java.util.Scanner;
public class App {
   
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String expression = input.nextLine();
        String[] tokens = expression.split(" ");
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                result += Integer.parseInt(tokens[i + 1]);
            } else if (tokens[i].equals("-")) {
                result -= Integer.parseInt(tokens[i + 1]);
            } else if (tokens[i].equals("*")) {
                result *= Integer.parseInt(tokens[i + 1]);
            } else if (tokens[i].equals("/")) {
                result /= Integer.parseInt(tokens[i + 1]);
            }
        }
        System.out.println(result);
    }
}
