package com.codycod.ms_bff.model.service.imp;

import com.codycod.ms_bff.model.client.IClientFeignClient;
import com.codycod.ms_bff.model.client.IFinancialProductFeignClient;
import com.codycod.ms_bff.model.dto.DetailResponseDTO;
import com.codycod.ms_bff.model.service.IDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DetailServiceImp implements IDetailService {

  private final IClientFeignClient clientFeignClient;
  private final IFinancialProductFeignClient productFeignClient;

  @Override
  public DetailResponseDTO getDetailFromAClient(Long clientId) {
    return DetailResponseDTO.builder()
            .client(clientFeignClient.getClientByUniqueCode(clientId))
            .products(productFeignClient.getAllFinancialProductsByClientId(clientId))
            .build();
  }
}
