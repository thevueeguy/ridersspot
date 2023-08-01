package com.sharad.ridersspot.collection.mapper;

import com.sharad.ridersspot.collection.Review;
import com.sharad.ridersspot.collection.dto.ReviewDTO;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {

    public Review convertToDocument(ReviewDTO reviewDTO){
        return Review.builder()
                .id(reviewDTO.getId())
                .userId(reviewDTO.getUserId())
                .bikeId(reviewDTO.getBikeId())
                .rating(reviewDTO.getRating())
                .comment(reviewDTO.getComment())
                .build();
    }

    public ReviewDTO convertToDTO(Review review){
        return ReviewDTO.builder()
                .id(review.getId())
                .userId(review.getUserId())
                .bikeId(review.getBikeId())
                .rating(review.getRating())
                .comment(review.getComment())
                .build();
    }
}
