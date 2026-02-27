package com.re4n.siem_receptor.service.rules;

import com.re4n.siem_receptor.dto.LogEventDTO;

public interface LogRule {
    void execute(LogEventDTO log);
}
