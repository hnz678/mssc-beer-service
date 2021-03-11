package com.example.springrest.msscbeerservice.boostrap;

import com.example.springrest.msscbeerservice.domain.Beer;
import com.example.springrest.msscbeerservice.repositories.BeerRepository;
import com.example.springrest.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository){
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                .beerName(("Mango Bobs"))
                .beerStyle(BeerStyleEnum.GOSE)
                .quantityToBrew(200)
                .upc(337010000001L)
                .price(new BigDecimal("12.95"))
                .build());
            beerRepository.save(Beer.builder()
                 .beerName(("Galaxy Cat"))
                 .beerStyle(BeerStyleEnum.PILSNER)
                 .quantityToBrew(200)
                 .upc(337010000002L)
                 .price(new BigDecimal("15.25"))
                 .build());
        }
        System.out.println("Loaded Beers: "+beerRepository.count());
    }
}
