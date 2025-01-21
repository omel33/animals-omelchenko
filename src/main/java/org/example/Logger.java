package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Logger {
    private final static Logger logger = new Logger();
    private final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    public void logMessage(String message) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime.format(formatter) + "|" + message);
    }

    public static Logger getInstance() {
        return logger;
    }
}
