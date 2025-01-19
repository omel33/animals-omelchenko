package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Logger {
    private final static Logger logger = new Logger();

    public void logMessage(String message) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime + "|" + message);
    }

    public static Logger getInstance() {
        return logger;
    }
}
