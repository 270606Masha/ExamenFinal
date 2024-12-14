package com.codycod.ms_client.model.service;

import com.codycod.ms_client.model.dto.ClientResponseDTO;

public interface IClientService {
  ClientResponseDTO getClientByUniqueCode(Long uniqueCode);
}
