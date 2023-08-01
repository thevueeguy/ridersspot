package com.sharad.ridersspot.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "review")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Review {
        @Id
        @NonNull
        private String id;
        @NonNull
        private String userId;
        @NonNull
        private String bikeId;
        @NonNull
        private Double rating;
        @NonNull
        private String comment;
}
