package com.codycod.ms_financial_product.controller;

import com.codycod.ms_financial_product.model.service.IFinancialProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class FinancialProductController {

  private final IFinancialProductService financialProductService;

  @GetMapping("/{clientId}")
  ResponseEntity<?> getAllFinancialProductsByClientId(@PathVariable Long clientId) {
    try {
      return ResponseEntity.ok(financialProductService.getAllFinancialProductsByClientId(clientId));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to get all financial products");
    }
  }
}
