import java.util.List;

public class DaeneryListener implements Listener {
    public DaeneryListener() {
    }

    @Override
    public void handle(List<?> reports) {
        System.out.println("Daenery Listener handle =====================");
        for(int i = 0; i < reports.size();i++){
            Report report = (Report) reports.get(i);
            System.out.println("Date of " + i + " - " + report.getDate() + "\n"
                    + "Message - " + report.getMessage() +
                    "\n_________________________________________________________");
        }
    }
}
