package com.erta.radar.dto;

import lombok.*;

import java.util.List;

@Data
public class VehicleDto {

    // todo not null fields
    private String plateNumber;
    private String driver;
    private List<MaintenanceDto> maintenances;
    private String brand;
    private String model;



}
