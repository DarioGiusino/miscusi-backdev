package org.miscusi.backdev.conf;

import java.util.logging.Handler;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

@Component
public class LoggerCleanup {

    private final Logger logger;

    public LoggerCleanup(Logger globalLogger) {
        this.logger = globalLogger;
    }

    @PreDestroy
    public void cleanUp() {
        for (Handler handler : logger.getHandlers()) {
            handler.close();
        }
    }
}
