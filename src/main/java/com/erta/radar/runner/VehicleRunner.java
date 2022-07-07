package com.erta.radar.runner;

import com.erta.radar.model.Driver;
import com.erta.radar.model.Vehicle;
import com.erta.radar.model.enums.FuelType;
import com.erta.radar.model.enums.Office;
import com.erta.radar.model.enums.VehicleType;
import com.erta.radar.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VehicleRunner implements CommandLineRunner {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleRunner(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        vehicleRepository.deleteAll();

        Driver driverOne = new Driver().builder()
                .name("ertan sarı")
                .build();

        Driver driverTwo = new Driver().builder()
                .name("ali veli")
                .build();

        List<Driver> tempList = new ArrayList<>();
        tempList.add(driverOne);

        vehicleRepository.save(new Vehicle().builder()
                .plateNumber("34 ELV 123")
                .fuelType(FuelType.DIESEL)
                .modelYear("2001")
                .officeUsed(Office.BAGBASI)
                .vehicleType(VehicleType.MINIBUS)
                .drivers(tempList)
                .kilometer(5000)
                .brand("citroen")
                .model("c3")
                .build());


        tempList.add(driverTwo);

        vehicleRepository.save(new Vehicle().builder()
                .plateNumber("20 AN 321")
                .fuelType(FuelType.GASOLINE)
                .officeUsed(Office.CAMLIK)
                .vehicleType(VehicleType.AUTOMOBILE)
                .modelYear("1999")
                .drivers(tempList)
                .kilometer(100000)
                .brand("suzuki")
                .model("vitara")
                .build());
    }
}
