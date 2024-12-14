package com.codycod.ms_financial_product;

import com.codycod.ms_financial_product.model.entity.FinancialProductEntity;
import com.codycod.ms_financial_product.model.enums.ProductTypeEnum;
import com.codycod.ms_financial_product.model.repository.IFinancialProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MsFinancialProductApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsFinancialProductApplication.class, args);
  }

  @Bean
  CommandLineRunner init(final IFinancialProductRepository repository) {
    return args -> {
      repository.saveAll(List.of(
              FinancialProductEntity.builder()
                      .productType(ProductTypeEnum.SAVINGS_ACCOUNT)
                      .productName("Premium")
                      .balance(300.54)
                      .clientId(1L)
                      .build(),
              FinancialProductEntity.builder()
                      .productType(ProductTypeEnum.CREDIT_CARD)
                      .productName("Platinum")
                      .balance(750.54)
                      .clientId(1L)
                      .build(),
              FinancialProductEntity.builder()
                      .productType(ProductTypeEnum.CREDIT_CARD)
                      .productName("Premium")
                      .balance(100.54)
                      .clientId(2L)
                      .build()
      ));
    };
  }

}
