/**
 * Created by futer25 on 27.04.2017.
 */
public class ConsoleEventLogger implements EventLogger {


    public ConsoleEventLogger(Event event) {
        logEvent(event);
    }

    public void logEvent(Event event) {
//        System.out.println(event.toString());
    }
}
