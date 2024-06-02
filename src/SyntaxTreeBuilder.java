import java.util.ArrayList;
import java.util.List;

public class SyntaxTreeBuilder {
    public static SyntaxTree syntaxTreeBuilder(String inputExpression) {
        SyntaxTree syntaxTree = new SyntaxTree(null);
        syntaxTree(syntaxTree, segment(inputExpression), 0);
        return syntaxTree;
    }

    private static Integer syntaxTree(SyntaxTree tree, List<String> segmentExpression, Integer index) {
        int i = index;
        while (i < segmentExpression.size() && !segmentExpression.get(i).equals(")")) {
            if (segmentExpression.get(i).equals("(")) {
                SyntaxTree tmpTree = new SyntaxTree("(");
                tree.getChildren().add(tmpTree);
                i = syntaxTree(tmpTree, segmentExpression, i + 1);
            } else {
                tree.getChildren().add(new SyntaxTree(segmentExpression.get(i)));
            }
            i++;
        }
        return i;
    }

    /*
    TODO:
     1. Support escape character
     */
    private static List<String> segment(String inputExpression) {
        List<String> segmentExpression = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < inputExpression.length(); i++) {
            Character c = inputExpression.charAt(i);
            if (Character.isLetterOrDigit(c) || c.equals('"') || c.equals('_')) {
                builder.append(c);
            } else {
                if (!builder.isEmpty()) segmentExpression.add(builder.toString());
                if (!Character.isWhitespace(c)) segmentExpression.add(c.toString());
                builder = new StringBuilder();
            }
        }

        return segmentExpression;
    }
}