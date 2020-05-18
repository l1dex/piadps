public class WhiteSpaceExpression implements Interpreter {
    private String regEx = " {2,}";

    public WhiteSpaceExpression() {
    }

    @Override
    public String interpretate(String str) {
        return str.replaceAll(regEx," ");
    }
}
