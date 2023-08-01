package com.sharad.ridersspot.collection.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BikeDTO {
    private String id;
    private String brand;
    private String model;
    private String price;
    private String color;
    private String location;
    private Boolean isAvailable;
    private Double rating;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
}
