package com.rafakwolf.flightreservation.repos;

import com.rafakwolf.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query(value = "select * from flight " +
            "where departure_city =:departureCity " +
            "and arrival_city =:arrivalCity " +
            "and date_of_departure =:dateOfDeparture", nativeQuery = true)
    List<Flight> findFlights(@Param("departureCity") String from,
                             @Param("arrivalCity") String to,
                             @Param("dateOfDeparture") Date departureDate);
}
