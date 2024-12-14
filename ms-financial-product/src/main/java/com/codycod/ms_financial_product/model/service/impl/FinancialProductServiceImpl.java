package com.codycod.ms_financial_product.model.service.impl;

import com.codycod.ms_financial_product.model.dto.FinancialProductResponseDTO;
import com.codycod.ms_financial_product.model.entity.FinancialProductEntity;
import com.codycod.ms_financial_product.model.repository.IFinancialProductRepository;
import com.codycod.ms_financial_product.model.service.IFinancialProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FinancialProductServiceImpl implements IFinancialProductService {

  private final IFinancialProductRepository financialProductRepository;

  @Override
  public List<FinancialProductResponseDTO> getAllFinancialProductsByClientId(long clientId) {
    List<FinancialProductEntity> financialProducts = financialProductRepository.findAllByClientId(clientId);
    return financialProducts.stream()
            .map(this::financialProductToResponseDTO)
            .collect(Collectors.toList());
  }

  private FinancialProductResponseDTO financialProductToResponseDTO(FinancialProductEntity financialProduct) {
    return FinancialProductResponseDTO.builder()
            .productType(financialProduct.getProductType())
            .productName(financialProduct.getProductName())
            .balance(financialProduct.getBalance())
            .build();
  }
}
