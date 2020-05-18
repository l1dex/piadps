public class Expression implements Interpreter {
    private DashExpression dashExpression;
    private LineExpression lineExpression;
    private QuationExpression quationExpression;
    private TabExpression tabExpression;
    private WSExpression wsExpression;
    private  WhiteSpaceExpression whiteSpaceExpression;

    public Expression(){
        dashExpression = new DashExpression();
        lineExpression = new LineExpression();
        quationExpression = new QuationExpression();
        tabExpression = new TabExpression();
        wsExpression = new WSExpression();
        whiteSpaceExpression = new WhiteSpaceExpression();
    }

    @Override
    public String interpretate(String str) {
        return whiteSpaceExpression.interpretate(
                wsExpression.interpretate(
                tabExpression.interpretate(
                quationExpression.interpretate(
                lineExpression.interpretate(
                dashExpression.interpretate(str))))));
    }
}
