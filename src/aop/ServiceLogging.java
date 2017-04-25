package aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by fsweb on 17-4-25.
 */
public class ServiceLogging {
    private Log log = LogFactory.getLog(this.getClass());

    public void beforeService(){
        log.info("业务方法被调用.");
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public static void main(String[] args) {
        ServiceLogging logging = new ServiceLogging();
        logging.beforeService();
    }
}
