package com.example.springrest.msscbeerservice.web.mappers;

import com.example.springrest.msscbeerservice.domain.Beer;
import com.example.springrest.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
