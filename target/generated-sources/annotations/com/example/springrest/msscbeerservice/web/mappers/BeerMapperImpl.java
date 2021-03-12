package com.example.springrest.msscbeerservice.web.mappers;

import com.example.springrest.msscbeerservice.domain.Beer;
import com.example.springrest.msscbeerservice.web.model.BeerDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-11T19:37:45-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
public class BeerMapperImpl implements BeerMapper {

    private final DateMapper dateMapper = new DateMapper();

    @Override
    public BeerDto BeerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        if ( beer.getVersion() != null ) {
            beerDto.setVersion( beer.getVersion().intValue() );
        }
        beerDto.setCreatedDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.setLastModifiedDate( dateMapper.asOffsetDateTime( beer.getLastModifiedDate() ) );
        beerDto.setBeerName( beer.getBeerName() );
        beerDto.setBeerStyle( beer.getBeerStyle() );
        beerDto.setUpc( beer.getUpc() );
        beerDto.setPrice( beer.getPrice() );

        return beerDto;
    }

    @Override
    public Beer BeerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Beer beer = new Beer();

        if ( dto.getVersion() != null ) {
            beer.setVersion( dto.getVersion().longValue() );
        }
        beer.setCreatedDate( dateMapper.asTimestamp( dto.getCreatedDate() ) );
        beer.setLastModifiedDate( dateMapper.asTimestamp( dto.getLastModifiedDate() ) );
        beer.setBeerName( dto.getBeerName() );
        beer.setBeerStyle( dto.getBeerStyle() );
        beer.setUpc( dto.getUpc() );
        beer.setPrice( dto.getPrice() );

        return beer;
    }
}
