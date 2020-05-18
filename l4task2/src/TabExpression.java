public class TabExpression implements Interpreter {
    private String reg = "\t{2,}";

    @Override
    public String interpretate(String str) {
        return str.replaceAll(reg,"\t");
    }
}
