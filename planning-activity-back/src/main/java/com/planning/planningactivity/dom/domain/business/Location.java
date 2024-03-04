package com.planning.planningactivity.dom.domain.business;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Location {
    private Integer country_code;
    private Double latitude;
    private Double longitude;
    private String coments;
}
