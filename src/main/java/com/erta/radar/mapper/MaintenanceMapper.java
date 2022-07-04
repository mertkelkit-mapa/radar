package com.erta.radar.mapper;

import com.erta.radar.dto.MaintenanceDto;
import com.erta.radar.model.Maintenance;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaintenanceMapper {

    MaintenanceDto mapToDto(Maintenance maintenance);

    List<MaintenanceDto> mapToDtoList(List<Maintenance> maintenanceList);

}
