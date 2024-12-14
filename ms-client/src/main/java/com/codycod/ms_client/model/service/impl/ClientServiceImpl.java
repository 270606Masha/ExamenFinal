package com.codycod.ms_client.model.service.impl;

import com.codycod.ms_client.model.dto.ClientResponseDTO;
import com.codycod.ms_client.model.entity.ClientEntity;
import com.codycod.ms_client.model.repository.IClientRepository;
import com.codycod.ms_client.model.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {

  private final IClientRepository clientRepository;

  @Override
  public ClientResponseDTO getClientByUniqueCode(Long uniqueCode) {
    ClientEntity client = clientRepository.findById(uniqueCode)
            .orElseThrow(() -> new RuntimeException("Client not found"));

    return clientToDTO(client);
  }

  private ClientResponseDTO clientToDTO(ClientEntity client) {
    return ClientResponseDTO.builder()
            .name(client.getName())
            .lastname(client.getLastname())
            .documentType(client.getDocumentType())
            .documentNumber(client.getDocumentNumber())
            .build();
  }
}
