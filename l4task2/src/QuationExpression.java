public class QuationExpression implements Interpreter {
    public QuationExpression(){}
    @Override
    public String interpretate(String str) {
        return str.replace("“","«").replace("”","»");
    }
}
