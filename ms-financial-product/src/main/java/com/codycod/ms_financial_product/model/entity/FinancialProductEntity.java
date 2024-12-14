package com.codycod.ms_financial_product.model.entity;

import com.codycod.ms_financial_product.model.enums.ProductTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "financial_products")
@Builder
public class FinancialProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Enumerated(EnumType.STRING)
  @Column(name = "product_type")
  private ProductTypeEnum productType;
  @Column(name = "product_name")
  private String productName;
  private double balance;
  @Column(name = "client_id")
  private Long clientId;
}
