import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog {

    private static final Logger log = LoggerFactory.getLogger(MyLog.class);

    public static void main(String[] args) {
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.trace("trace");
        log.warn("warn");
    }
}
