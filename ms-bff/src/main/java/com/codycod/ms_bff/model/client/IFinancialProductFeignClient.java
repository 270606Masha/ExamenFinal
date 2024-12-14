package com.codycod.ms_bff.model.client;

import com.codycod.ms_bff.model.dto.FinancialProductResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ms-financial-product", url = "http://ms-financial-product:9093/api/products")
public interface IFinancialProductFeignClient {
  @GetMapping("/{clientId}")
  public List<FinancialProductResponseDTO> getAllFinancialProductsByClientId(@PathVariable Long clientId);
}
