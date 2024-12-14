package com.codycod.ms_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailResponseDTO {
  private ClientResponseDTO client;
  private List<FinancialProductResponseDTO> products;
}
