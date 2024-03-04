package com.planning.planningactivity.dom.domain.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Timezone {
    private String name;
    private Location location;
}
