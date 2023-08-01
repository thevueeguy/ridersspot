package com.sharad.ridersspot.collection.mapper;

import com.sharad.ridersspot.collection.Reservation;
import com.sharad.ridersspot.collection.dto.ReservationDTO;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {
    public Reservation convertToDocument(ReservationDTO reservationDTO){
        return Reservation.builder()
                .id(reservationDTO.getId())
                .bikeId(reservationDTO.getBikeId())
                .userId(reservationDTO.getUserId())
                .status(reservationDTO.getStatus())
                .fromDate(reservationDTO.getFromDate())
                .toDate(reservationDTO.getToDate())
                .build();
    }

    public ReservationDTO convertToDTO(Reservation reservation){
        return ReservationDTO.builder()
                .id(reservation.getId())
                .bikeId(reservation.getBikeId())
                .userId(reservation.getUserId())
                .status(reservation.getStatus())
                .fromDate(reservation.getFromDate())
                .toDate(reservation.getToDate())
                .build();
    }
}
