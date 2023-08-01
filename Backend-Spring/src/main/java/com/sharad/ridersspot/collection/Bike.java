package com.sharad.ridersspot.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bike")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bike {
    @Id
    @NonNull
    private String id;
    @NonNull
    private String brand;
    @NonNull
    private String model;
    @NonNull
    private String price;
    @NonNull
    private String color;
    @NonNull
    private String location;
    @NonNull
    private Boolean isAvailable;
    @NonNull
    private Double rating;
    @NonNull
    private LocalDateTime fromDate;
    @NonNull
    private LocalDateTime toDate;
}
