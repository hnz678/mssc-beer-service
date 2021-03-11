package com.example.springrest.msscbeerservice.web.controller;

import com.example.springrest.msscbeerservice.web.model.BeerDto;
import com.example.springrest.msscbeerservice.web.service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //to impl
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK );  //200
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //todo impl
        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer"+savedDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);  //201
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        //todo impl
        beerService.updateBeer(beerId, beerDto);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteById(beerId);
    }

}
