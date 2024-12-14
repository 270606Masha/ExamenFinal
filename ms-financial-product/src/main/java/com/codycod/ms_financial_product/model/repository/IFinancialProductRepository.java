package com.codycod.ms_financial_product.model.repository;

import com.codycod.ms_financial_product.model.entity.FinancialProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFinancialProductRepository extends JpaRepository<FinancialProductEntity, Long> {
  List<FinancialProductEntity> findAllByClientId(Long clientId);
}
