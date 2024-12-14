package com.codycod.ms_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDTO {
  private String name;
  private String lastname;
  private String documentType;
  private String documentNumber;
}