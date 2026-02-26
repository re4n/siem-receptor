package com.re4n.siem_receptor.controller;

import com.re4n.siem_receptor.dto.LogEventDTO;
import com.re4n.siem_receptor.service.LogProcessorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ingest")
public class EventController {
    private final LogProcessorService logProcessorService;

    public EventController(LogProcessorService logProcessorService) {
        this.logProcessorService = logProcessorService;
    }

    @PostMapping
    public ResponseEntity<Void> receiveLog(@Valid @RequestBody LogEventDTO logEvent) {
        logProcessorService.printLog(logEvent);
        return ResponseEntity.accepted().build();
    }

}
