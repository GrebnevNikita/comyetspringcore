/**
 * Created by futer25 on 27.04.2017.
 */
public class Client {

    private String id;
private  String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {

        this.greeting = greeting;
    }

    private String fullName;

    public Client(String s, String s1) {
        this.id=s;
        this.fullName=s1;
    }

    public Client() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
