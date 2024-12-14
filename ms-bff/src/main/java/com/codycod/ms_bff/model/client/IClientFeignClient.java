package com.codycod.ms_bff.model.client;

import com.codycod.ms_bff.model.dto.ClientResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-client", url = "http://ms-client:9094/api/clients")
public interface IClientFeignClient {
  @GetMapping("/{uniqueCode}")
  public ClientResponseDTO getClientByUniqueCode(@PathVariable Long uniqueCode);
}
