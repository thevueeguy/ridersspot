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
@Document(collection = "reservation")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reservation {
    @Id
    @NonNull
    private String id;
    @NonNull
    private String bikeId;
    @NonNull
    private String userId;
    @NonNull
    private LocalDateTime fromDate;
    @NonNull
    private LocalDateTime toDate;
    @NonNull
    private String status;
}
