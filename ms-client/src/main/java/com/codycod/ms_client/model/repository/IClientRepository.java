package com.codycod.ms_client.model.repository;

import com.codycod.ms_client.model.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<ClientEntity, Long> {

}
