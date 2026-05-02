package com.management.controllers;

import com.management.builders.HomeBuilder;
import com.management.dto.HomeDTO;
import com.management.dto.PageHomeDTO;
import com.management.services.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    private final HomeService homeService;
    private final HomeBuilder homeBuilder;

    @GetMapping
    public ResponseEntity<PageHomeDTO> findAll(Pageable pageable) {
        return ResponseEntity.ok(homeBuilder.build(homeService.findAll(pageable)));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody HomeDTO dto) {
        homeService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
