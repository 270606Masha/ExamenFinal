package com.codycod.ms_bff.controller;

import com.codycod.ms_bff.model.service.IDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/details")
@RequiredArgsConstructor
public class DetailController {

  private final IDetailService detailService;

  @GetMapping("/{clientId}")
  ResponseEntity<?> getDetailFromClient(@PathVariable long clientId) {
    try {
      return ResponseEntity.ok(detailService.getDetailFromAClient(clientId));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getCause());
    }
  }

}
