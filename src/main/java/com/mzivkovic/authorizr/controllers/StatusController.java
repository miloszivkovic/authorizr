package com.mzivkovic.authorizr.controllers;

import com.mzivkovic.authorizr.dto.response.StatusResponse;
import com.mzivkovic.authorizr.services.StatusService;
import com.mzivkovic.authorizr.util.HttpConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(HttpConstants.PATH_STATUS)
public class StatusController {

    private final StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping
    public ResponseEntity<StatusResponse> getApplicationStatus() {
        return ResponseEntity.ok(new StatusResponse(statusService.getUptimeMillis()));
    }
}
