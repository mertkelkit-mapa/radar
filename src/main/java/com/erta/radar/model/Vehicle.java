package com.erta.radar.model;


import com.erta.radar.model.enums.FuelType;
import com.erta.radar.model.enums.Office;
import com.erta.radar.model.enums.VehicleType;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String plateNumber;
    // todo datetime year ?
    private String modelYear;
    private String brand;
    private String model;
    private VehicleType vehicleType;
    private Office officeUsed;
    private FuelType fuelType;
    // todo read more about database and jpa
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
    private List<Driver> drivers = new ArrayList<>();
    @OneToMany(mappedBy = "vehicle", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Maintenance> maintenances = new ArrayList<>();
    private int kilometer;

}
