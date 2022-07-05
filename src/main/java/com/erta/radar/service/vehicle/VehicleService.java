package com.erta.radar.service.vehicle;

import com.erta.radar.dto.VehicleDto;
import com.erta.radar.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VehicleService {
    public List<VehicleDto> getAllVehicles();

    public VehicleDto addVehicle(VehicleDto vehicleDto);

    public VehicleDto updatePlateNumber(String plateNumber, String vehicleId);

    public VehicleDto updateDriver(String driver, String vehicleId);

    public void deleteVehicle(String vehicleId);

}
