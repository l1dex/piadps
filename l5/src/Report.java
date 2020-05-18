import java.util.Date;

public class Report {
    private String message;
    private Date date;

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public Report(String message) {
        this.message = message;
        this.date = new Date();
    }
}
