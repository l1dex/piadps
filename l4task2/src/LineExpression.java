public class LineExpression implements Interpreter {
    private String reg = "\n{2,}";

    @Override
    public String interpretate(String str) {
        return str.replaceAll(reg,"\n");
    }
}
