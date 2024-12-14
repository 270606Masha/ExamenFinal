package com.codycod.ms_financial_product.model.dto;

import com.codycod.ms_financial_product.model.enums.ProductTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialProductResponseDTO {
  private ProductTypeEnum productType;
  private String productName;
  private double balance;
}
