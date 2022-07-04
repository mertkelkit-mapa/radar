package com.erta.radar.repository;


import com.erta.radar.dto.VehicleDto;
import com.erta.radar.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

    // todo what da fuk
    List<Vehicle> getAllByIdNotNull();


}
