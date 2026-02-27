package com.re4n.siem_receptor.service.rules;

import com.re4n.siem_receptor.dto.LogEventDTO;
import com.re4n.siem_receptor.enums.Category;
import com.re4n.siem_receptor.enums.Severity;
import org.springframework.stereotype.Component;

@Component
public class CriticalAuthRule implements LogRule {
    @Override
    public void execute(LogEventDTO logEvent){
        if (Category.AUTH.equals(logEvent.getCategory()) && Severity.CRITICAL.equals(logEvent.getSeverity())) {
            System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.err.println("Security Alert - CRITICAL LOGIN ATTEMPT");
            System.err.println("HOSTNAME: " + logEvent.getHostname() + "\n" +
                    "USER: " + logEvent.getUserId() + "\n" +
                    "MESSAGE: " + logEvent.getMessage());
            System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
