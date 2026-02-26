package com.re4n.siem_receptor.dto;

import com.re4n.siem_receptor.enums.Severity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LogEventDTO {
    @NotBlank(message = "timestamp cannot be empty!")
    private String timestamp;
    @NotBlank(message = "hostname cannot be empty!")
    private String hostname;
    @NotBlank(message = "source cannot be empty!")
    private String source;
    @NotNull(message = "severity cannot be Null!")
    private Severity severity;
    @NotBlank(message = "message cannot be empty!")
    private String message;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
