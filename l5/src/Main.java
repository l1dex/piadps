import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static void help(){
        System.out.println("Help page ---------------------\n"
                +"r - add report\n"
                + "n - notify listeners\n");
    }

    static void addReport(DeaneryEvent deaneryEvent,Scanner scanner){
        System.out.println("Enter message");
        deaneryEvent.addReport(new Report(scanner.nextLine()));
    }

    public static void main(String[] args) throws Exception {
        DeaneryEvent deaneryEvent = new DeaneryEvent();
        DaeneryListener daeneryListener = new DaeneryListener();
        deaneryEvent.addListener(daeneryListener);
        Scanner scanner = new Scanner(System.in);
        char ch;
        while (true){
            ch = scanner.nextLine().charAt(0);
            switch (ch){
                case 'h': help();
                break;
                case 'r' : addReport(deaneryEvent,scanner);
                break;
                case 'n' : deaneryEvent.notice();
            }
        }
    }
}
