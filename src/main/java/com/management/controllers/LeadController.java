package com.management.controllers;

import com.management.dto.LeadDTO;
import com.management.services.LeadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/lead")
public class LeadController {

    private final LeadService leadService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody LeadDTO dto) {
        leadService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
