package com.codycod.ms_client.controller;

import com.codycod.ms_client.model.dto.ClientResponseDTO;
import com.codycod.ms_client.model.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

  private final IClientService clientService;

  @GetMapping("/{uniqueCode}")
  ResponseEntity<?> getClientByUniqueCode(@PathVariable Long uniqueCode) {
    try {
      ClientResponseDTO client = clientService.getClientByUniqueCode(uniqueCode);
      return ResponseEntity.ok(client);
    } catch (RuntimeException e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
  }

}
