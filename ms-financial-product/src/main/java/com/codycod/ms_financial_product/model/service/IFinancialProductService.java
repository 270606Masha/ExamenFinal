package com.codycod.ms_financial_product.model.service;

import com.codycod.ms_financial_product.model.dto.FinancialProductResponseDTO;

import java.util.List;

public interface IFinancialProductService {
  List<FinancialProductResponseDTO> getAllFinancialProductsByClientId(long clientId);
}
