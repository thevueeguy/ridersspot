package com.sharad.ridersspot.service.implementation;

import com.sharad.ridersspot.collection.mapper.ReservationMapper;
import com.sharad.ridersspot.repository.ReservationRepository;
import com.sharad.ridersspot.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ReservationMapper reservationMapper;
}
