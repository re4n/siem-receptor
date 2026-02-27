package com.re4n.siem_receptor.service;

import com.re4n.siem_receptor.dto.LogEventDTO;
import com.re4n.siem_receptor.service.rules.LogRule;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LogProcessorService {

    private final List<LogRule> rules;

    public LogProcessorService(List<LogRule> rules) {
        this.rules = rules;
    }

    public void printLog(LogEventDTO logEvent) {
        System.out.println("== Received Log Event == \n" +
                "HOSTNAME: " + logEvent.getHostname() + "\n");

        rules.forEach(rule -> rule.execute(logEvent));
        }
}

