package com.re4n.siem_receptor.service;

import com.re4n.siem_receptor.dto.LogEventDTO;
import org.springframework.stereotype.Service;

@Service
public class LogProcessorService {

    public void printLog(LogEventDTO logEvent) {
        System.out.println("== Received Log Event == \n" +
                "HOSTNAME: " + logEvent.getHostname() + "\n" +
                "SEVERITY: " + logEvent.getSeverity() + "\n" +
                "MESSAGE: " + logEvent.getMessage());
    }
}
