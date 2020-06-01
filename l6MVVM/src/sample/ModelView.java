package sample;

public class ModelView {
    private String arabicNum;

    public String getArabicNum() {
        return convert(arabicNum);
    }

    public ModelView() {
        this.arabicNum = "def";
    }

    public void setArabicNum(String arabicNum) {
        this.arabicNum = arabicNum;
    }
    public String convert(String arabicNum){
        return Model.convert(arabicNum);
    }
}
