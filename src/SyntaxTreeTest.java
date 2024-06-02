import org.junit.jupiter.api.Test;

public class SyntaxTreeTest {
    @Test
    void test1() {
        SyntaxTree expression = SyntaxTreeBuilder.syntaxTreeBuilder("(define (exclaim msg1 msg2) (display msg1) (display msg2) (display \"n\"))");
    }
}
