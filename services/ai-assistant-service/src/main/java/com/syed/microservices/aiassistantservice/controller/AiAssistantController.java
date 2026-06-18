package com.syed.microservices.aiassistantservice.controller;

import com.syed.microservices.aiassistantservice.dto.AnalyzeLogRequest;
import com.syed.microservices.aiassistantservice.dto.AnalyzeLogResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ai")
public class AiAssistantController {

    @PostMapping("/analyze-log")
    public ResponseEntity<AnalyzeLogResponse> analyze(@RequestBody AnalyzeLogRequest request) {
        AnalyzeLogResponse response = new AnalyzeLogResponse();
        response.setSummary("Stub: AI analysis not yet wired to an LLM.");
        response.setProbableCause("N/A");
        response.setSuggestedFix("Integrate Spring AI + Ollama once the platform upgrades to Spring Boot 3.x.");
        return ResponseEntity.ok(response);
    }
}

