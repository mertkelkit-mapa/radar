package com.erta.radar.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum VehicleType {

    MINIBUS("MINIBUS"),
    AUTOMOBILE("AUTOMOBILE");

    @Getter private String value;

}
