import java.util.*;

public class SyntaxTree {
    private String value;
    private List<SyntaxTree> children;

    public SyntaxTree(String value) {
        this.value = value;
        children = new ArrayList<>();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<SyntaxTree> getChildren() {
        return children;
    }

    public void setChildren(List<SyntaxTree> children) {
        this.children = children;
    }

    public String computeExpression() {
        return null;
    }
}
