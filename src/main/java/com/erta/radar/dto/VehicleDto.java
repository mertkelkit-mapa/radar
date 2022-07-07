package com.erta.radar.dto;

import com.erta.radar.model.Driver;
import lombok.*;

import java.util.List;

@Data
public class VehicleDto {

    // todo not null fields
    private String plateNumber;
    private int modelYear;
    private String brand;
    private String model;
    private String vehicleType;
    private List<Driver> drivers;
    private List<MaintenanceDto> maintenances;
    private int kilometer;



}
