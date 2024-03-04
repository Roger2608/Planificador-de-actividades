package com.planning.planningactivity.dom.domain.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Date {
    private Timezone timezone;
    private Long offset;
    private Long timesstamp;
    private List<Action> listActions;
}
