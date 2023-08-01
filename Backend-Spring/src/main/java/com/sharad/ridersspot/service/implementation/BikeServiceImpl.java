package com.sharad.ridersspot.service.implementation;

import com.sharad.ridersspot.collection.mapper.BikeMapper;
import com.sharad.ridersspot.repository.BikeRepository;
import com.sharad.ridersspot.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    @Autowired
    private BikeMapper bikeMapper;
}
