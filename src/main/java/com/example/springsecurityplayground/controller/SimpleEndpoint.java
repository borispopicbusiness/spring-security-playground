package com.example.springsecurityplayground.controller;

import com.example.springsecurityplayground.dto.request.SimpleRequestDTO;
import com.example.springsecurityplayground.dto.response.SimpleResponseDTO;
import org.springframework.http.ResponseEntity;

public interface SimpleEndpoint {
    ResponseEntity<SimpleResponseDTO> getSimpleResponse(SimpleRequestDTO request);
}
