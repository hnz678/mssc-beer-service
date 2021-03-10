package com.example.springrest.msscbeerservice.web.controller;

import com.example.springrest.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    //private BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID bearId){
        //to impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK );  //200
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //todo impl

        return new ResponseEntity(HttpStatus.CREATED);  //201
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID bearId, @RequestBody BeerDto beerDto){
        //todo impl

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
