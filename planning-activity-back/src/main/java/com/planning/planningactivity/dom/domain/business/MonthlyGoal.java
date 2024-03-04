package com.planning.planningactivity.dom.domain.business;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MonthlyGoal extends Goal{
    private DateRange dateRange;
}
