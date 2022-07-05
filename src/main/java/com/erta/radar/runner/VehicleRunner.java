package com.erta.radar.runner;

import com.erta.radar.model.Vehicle;
import com.erta.radar.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        vehicleRepository.save(new Vehicle().builder()
                .plateNumber("34 ELV 123")
                .driver("ertan sarı")
                .kilometer(5000)
                .brand("citroen")
                .model("c3")
                .build());

        vehicleRepository.save(new Vehicle().builder()
                .plateNumber("20 AN 321")
                .driver("Ali Veli")
                .kilometer(100000)
                .brand("suzuki")
                .model("vitara")
                .build());
    }
}
