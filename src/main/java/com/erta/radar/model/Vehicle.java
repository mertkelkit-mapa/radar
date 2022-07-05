package com.erta.radar.model;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    // todo plate object
    private String plateNumber;
    // todo driver object
    // make driver as list and show according to dates
    private String driver;
    @OneToMany(mappedBy = "vehicle", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Maintenance> maintenances = new ArrayList<>();
    private int kilometer;
    // todo enum brand-model
    private String brand;
    private String model;

}
