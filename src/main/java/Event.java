import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by futer25 on 27.04.2017.
 */
public class Event {
    private  DateFormat df;
    private int id;
    private String msg;
    private Date date;


    public Event() {
        this.id = (int) Math.random() * 100;
        this.date = new Date();
    }

    public Event(Date date, DateFormat df) {
        this.id = (int) (Math.random() * 100);
        this.date =date;
        this.df=df;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
