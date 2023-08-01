package com.sharad.ridersspot.service.implementation;

import com.sharad.ridersspot.collection.mapper.ReviewMapper;
import com.sharad.ridersspot.repository.ReviewRepository;
import com.sharad.ridersspot.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ReviewMapper reviewMapper;
}
