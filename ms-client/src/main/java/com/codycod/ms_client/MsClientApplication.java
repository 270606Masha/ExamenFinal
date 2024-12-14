package com.codycod.ms_client;

import com.codycod.ms_client.model.entity.ClientEntity;
import com.codycod.ms_client.model.enums.DocumentTypeEnum;
import com.codycod.ms_client.model.repository.IClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MsClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsClientApplication.class, args);
  }

  @Bean
  CommandLineRunner init(IClientRepository clientRepository) {
    return args -> {
      clientRepository.saveAll(List.of(
              ClientEntity.builder()
                      .name("Massiel")
                      .lastname("Silva")
                      .documentType(DocumentTypeEnum.DNI)
                      .documentNumber("12345678")
                      .build()
      ));
    };
  }

}
