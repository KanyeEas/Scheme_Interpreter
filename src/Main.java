import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello");

        while (true) {
            System.out.print(": ");
            SyntaxTree expression = SyntaxTreeBuilder.syntaxTreeBuilder(in.nextLine());
            System.out.println("> " + expression.computeExpression());
        }
    }
}