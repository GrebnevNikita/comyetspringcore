import org.apache.commons.io.FileUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by futer25 on 27.04.2017.
 */
public class CacheFileEventLogger extends FileEventLogger {
    private int cacheSize=10;
    private List<Event> cache = new ArrayList<>();

    public CacheFileEventLogger(String filename,Event event) {

        super(filename);
        logEvent(event);
    }

    public CacheFileEventLogger(int i) {
        super("uuu");
        this.cacheSize=i;
    }




    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if (cache.size() == cacheSize) {
            writeEvenstFromCache();
            cache.clear();
        }
    }

    public void destroy() {


        if (!cache.isEmpty()) {

            writeEvenstFromCache();
        }
    }

    public void writeEvenstFromCache() {
        for (Event event:cache
             ) {

            try {
                System.out.println("444 "+super.getFilename());
                FileUtils.writeStringToFile(super.getFile(),event.toString()+System.lineSeparator(),true);
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
    }


}
