package com.example.springsecurityplayground.controller.impl;

import com.example.springsecurityplayground.controller.SimpleEndpoint;
import com.example.springsecurityplayground.dto.request.SimpleRequestDTO;
import com.example.springsecurityplayground.dto.response.SimpleResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/simple")
public class SimpleEndpointImpl implements SimpleEndpoint {
    @Override
    @PostMapping("/empty")
    public ResponseEntity<SimpleResponseDTO> getSimpleResponse(@RequestBody SimpleRequestDTO request) {
        return ResponseEntity.ok(SimpleResponseDTO.builder()
                .message(null)
                .build()
        );
    }
}