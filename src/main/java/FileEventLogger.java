import org.apache.commons.io.FileUtils;

import java.io.*;

/**
 * Created by futer25 on 27.04.2017.
 */
public class FileEventLogger implements EventLogger {
    private String filename;
    private File file;

    public FileEventLogger(String s, Event event) {
    }
    public FileEventLogger(String filename) {
        this.filename = filename;
        this.file= new File(filename);
    }

    public String getFilename() {
        return filename;
    }

    public File getFile() {
        return file;
    }



    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file,event.toString(),true);
            System.out.println("55555555");

        } catch (Exception e) {
            System.out.println( e.getMessage());
        }

    }
    public void init() throws IOException{
        this.file = new File(filename);
    }
}
