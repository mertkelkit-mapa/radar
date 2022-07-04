package com.erta.radar.dto;

import com.erta.radar.model.Vehicle;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MaintenanceDto {

    private double cost;
    private String description;
    private Vehicle vehicle;

}
