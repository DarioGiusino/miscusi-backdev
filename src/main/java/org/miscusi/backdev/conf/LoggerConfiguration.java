package org.miscusi.backdev.conf;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfiguration {

    @Bean
    Logger globalLogger() {
        Logger logger = Logger.getLogger("GlobalLogger");
        logger.setLevel(Level.INFO);

        try {
            FileHandler fileHandler = new FileHandler("global-logs.log", true);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            // Handle the exception
        }

        return logger;
    }
}
