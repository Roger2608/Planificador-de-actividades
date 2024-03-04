package com.planning.planningactivity.dom.domain.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Action {
    private String type;
    private LocalDate date;
    private String description;
}
