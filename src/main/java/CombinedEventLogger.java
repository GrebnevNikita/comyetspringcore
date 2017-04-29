import java.util.Collection;
import java.util.Collections;

/**
 * Created by futer25 on 28.04.2017.
 */
public class CombinedEventLogger implements EventLogger {

    private Collection loggers;

    public CombinedEventLogger(Collection loggers) {
        this.loggers = loggers;
    }

    public CombinedEventLogger() {
    }

    @Override
    public void logEvent(Event event) {

    }
}
