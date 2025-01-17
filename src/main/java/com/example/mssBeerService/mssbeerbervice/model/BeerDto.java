package com.example.mssBeerService.mssbeerbervice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private  Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lasModifiedDate;
    private  String beerName;
    private BeerStyleName beerStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityONHand;
}
