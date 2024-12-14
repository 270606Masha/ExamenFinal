package com.codycod.ms_client.model.dto;

import com.codycod.ms_client.model.enums.DocumentTypeEnum;
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
  private DocumentTypeEnum documentType;
  private String documentNumber;
}
