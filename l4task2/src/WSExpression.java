public class WSExpression implements Interpreter {
    private String regExOpenSc = "\\( ";
    private String regExCloseSc = " \\)";
    private String regExDot = " \\.";
    private String regExNDot = " \\,";
    @Override
    public String interpretate(String str) {
        return str.replaceAll(regExOpenSc,"(")
                .replaceAll(regExCloseSc,")")
                .replaceAll(regExDot,".")
                .replaceAll(regExNDot,",");
    }
}
