public class DashExpression implements Interpreter {
    private char dash = '–';
    private char ndash = '-';
    private String reg1 = " - ";

    public DashExpression() {
    }

    @Override
    public String interpretate(String str) {
        String phase = str.replaceAll(reg1,"-");
        StringBuilder last = new StringBuilder(phase);
        for(int i = 1; i < last.length()-1;i++){
            if(last.charAt(i) == '–'){
                if(last.charAt(i+1) != ' ') last.insert(i+1,' ');
                if(last.charAt(i-1) != ' ') last.insert(i,' ');
            }
        }
        return last.toString();
    }
}
