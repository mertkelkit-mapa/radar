package com.erta.radar.controller;

import com.erta.radar.model.Vehicle;
import com.erta.radar.service.vehicle.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

}
