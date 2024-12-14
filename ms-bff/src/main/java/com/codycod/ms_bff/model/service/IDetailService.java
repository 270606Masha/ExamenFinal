package com.codycod.ms_bff.model.service;

import com.codycod.ms_bff.model.dto.DetailResponseDTO;

public interface IDetailService {
  DetailResponseDTO getDetailFromAClient(Long clientId);
}
