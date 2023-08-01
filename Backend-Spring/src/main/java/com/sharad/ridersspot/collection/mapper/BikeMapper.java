package com.sharad.ridersspot.collection.mapper;

import com.sharad.ridersspot.collection.Bike;
import com.sharad.ridersspot.collection.dto.BikeDTO;
import org.springframework.stereotype.Component;

@Component
public class BikeMapper {
    public Bike convertToDocument(BikeDTO bikeDTO){
        return Bike.builder()
                .id(bikeDTO.getId())
                .color(bikeDTO.getColor())
                .model(bikeDTO.getModel())
                .price(bikeDTO.getPrice())
                .brand(bikeDTO.getBrand())
                .fromDate(bikeDTO.getFromDate())
                .toDate(bikeDTO.getToDate())
                .isAvailable(bikeDTO.getIsAvailable())
                .location(bikeDTO.getLocation())
                .rating(bikeDTO.getRating())
                .build();
    }

    public BikeDTO convertToDTO(Bike bike){
        return BikeDTO.builder()
                .id(bike.getId())
                .color(bike.getColor())
                .model(bike.getModel())
                .price(bike.getPrice())
                .brand(bike.getBrand())
                .fromDate(bike.getFromDate())
                .toDate(bike.getToDate())
                .isAvailable(bike.getIsAvailable())
                .location(bike.getLocation())
                .rating(bike.getRating())
                .build();
    }
}
