package com.example.springrest.msscbeerservice.web.service;

import com.example.springrest.msscbeerservice.web.model.BeerDto;
import com.example.springrest.msscbeerservice.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .version(1)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .beerName("ButLight")
                .beerStyle(BeerStyleEnum.ALE)
                .upc(12345678901L)
                .price(new BigDecimal("12.33"))
                .quantityOnHand(1000)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Updating a beer...");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
