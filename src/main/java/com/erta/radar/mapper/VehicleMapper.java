package com.erta.radar.mapper;

import com.erta.radar.dto.VehicleDto;
import com.erta.radar.model.Vehicle;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = MaintenanceMapper.class)
public interface VehicleMapper {

    VehicleDto mapToDto(Vehicle vehicle);

    List<VehicleDto> mapToDtoList(List<Vehicle> vehicleList);

    Vehicle mapToModel(VehicleDto vehicleDto);

}
