package com.codycod.ms_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialProductResponseDTO {
  private String productType;
  private String productName;
  private double balance;
}
