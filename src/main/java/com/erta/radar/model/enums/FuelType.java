package com.erta.radar.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FuelType {

    GASOLINE("GASOLINE"),
    DIESEL("DIESEL");

    @Getter
    private String value;

}
