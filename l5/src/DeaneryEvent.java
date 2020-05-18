import java.util.*;

public class DeaneryEvent implements EventManager {
    private List<Listener> listeners;
    private List<Report> reports;

    @Override
    public boolean addListener(Listener listener) {
        listeners.add(listener);
        return true;
    }

    @Override
    public boolean deleteListener(Listener listener) {
        listeners.remove(listener);
        return true;
    }

    @Override
    public void notice() {
        if(listeners.size() != 0 && reports.size()!=0)
            for(Listener listener : listeners)
                listener.handle(reports);

    }

    public void addReport(Report report){
        reports.add(report);
    }

    public DeaneryEvent() {
        listeners = new ArrayList<>();
        reports = new ArrayList<>();
        weeklyNotice();
    }

    private void weeklyNotice(){
        new Timer().scheduleAtFixedRate(
                new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("Weekly notice ----------");
                        notice();
                    }
                },new Date(),60000
        );
    }
}
