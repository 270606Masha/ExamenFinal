package com.codycod.ms_client.model.entity;

import com.codycod.ms_client.model.enums.DocumentTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clients")
@Entity
@Builder
public class ClientEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String lastname;
  @Column(name = "document_type")
  @Enumerated(EnumType.STRING)
  private DocumentTypeEnum documentType;
  @Column(name = "document_number")
  private String documentNumber;
}
