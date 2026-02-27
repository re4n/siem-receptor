package com.re4n.siem_receptor.dto;

import com.re4n.siem_receptor.enums.Action;
import com.re4n.siem_receptor.enums.Category;
import com.re4n.siem_receptor.enums.Severity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LogEventDTO {
    // -- Identifier
    @NotBlank(message = "timestamp cannot be empty!")
    private String timestamp;
    @NotBlank(message = "hostname cannot be empty!")
    private String hostname;
    @NotBlank(message = "ip address cannot be empty")
    private String ip_address;
    @NotBlank(message = "source cannot be empty!")
    private String source;

    // -- Classification
    @NotNull(message = "category cannot be null")
    private Category category;
    @NotNull(message = "severity cannot be null!")
    private Severity severity;
    @NotNull(message = "action cannot be null!")
    private Action action;

    // -- Context
    @NotBlank(message = "message cannot be empty!")
    private String message;

    //  -- User
    private String userId;
    private String userDomain;

    // -- Forensic
    @NotNull(message = "processId cannot be null!")
    private Long processId;
    @NotBlank(message = "processName cannot be empty!")
    private String processName;

    // -- Connectivity
    private String sourceIp;
    @NotNull(message = "destinationPort cannot be null!")
    private Integer destinationPort;
    private String macAddress;

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

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserDomain() {
        return userDomain;
    }

    public void setUserDomain(String userDomain) {
        this.userDomain = userDomain;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public Integer getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}
