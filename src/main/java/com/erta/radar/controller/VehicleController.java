package com.erta.radar.controller;

import com.erta.radar.dto.VehicleDto;
import com.erta.radar.model.Vehicle;
import com.erta.radar.service.vehicle.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/v0/vehicles")
public class VehicleController {

    // "/" -> getAllVehicles
    // "/vehicles/{plateNumber}"  -> getVehicleById  -> vehicleProfile
    // "/vehicles/{plateNumber}/maintenances "  -> getAllMaintenances ? -> maintenanceController

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<VehicleDto> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @RequestMapping(value= "/", method = RequestMethod.POST)
    public VehicleDto addVehicle(@RequestBody VehicleDto vehicleDto){
        return vehicleService.addVehicle(vehicleDto);
    }

    // todo find a good logic for this update methods and implement
    @RequestMapping(value = "/{vehicleId}/plate", method = RequestMethod.PUT)
    public VehicleDto updatePlateNumber(@RequestParam String plateNumber, @PathVariable String vehicleId){
        return vehicleService.updatePlateNumber(plateNumber, vehicleId);
    }

    @RequestMapping(value = "/{vehicleId}/driver", method = RequestMethod.PUT)
    public VehicleDto updateDriver(@RequestParam String driver, @PathVariable String vehicleId){
        return vehicleService.updateDriver(driver, vehicleId);
    }

    @RequestMapping(value = "/{vehicleId}")
    public void deleteVehicle(@PathVariable String vehicleId){
        vehicleService.deleteVehicle(vehicleId);
    }

}
