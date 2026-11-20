package com.example.employeemanagement.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SystemHealthLogger {
    private static final Logger log = LoggerFactory.getLogger(SystemHealthLogger.class);

    @Scheduled(fixedRate = 30_000)
    public void logSystemRunning() {
        log.info("System running");
    }
}
