import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by futer25 on 27.04.2017.
 */
public class App {

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ConsoleEventLogger getEventLogger() {
        return eventLogger;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }

    public App(Client client, ConsoleEventLogger eventLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.loggers = loggers;
    }

    private Client client;
    private ConsoleEventLogger eventLogger;
    private Map<EventType, EventLogger> loggers;

    private void logEvent(EventType type, String msg) {
        EventLogger logger = loggers.get(type);
        if (logger == null) {
            logger = loggers.get(EventType.ERROR);
        }
        logger.logEvent(event);
    }

    public static void main(String[] args) {


        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        app.logEvent(EventType.ERROR,"sdfsdfsd");
        app.logEvent(EventType.INFO,"sdfsdfsd");
        app.logEvent(null,"sdfsdfsd");
        ctx.close();
    }

}
