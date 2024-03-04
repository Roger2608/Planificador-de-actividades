package com.planning.planningactivity.dom.domain.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Goals {

    private List<DailyGoal> daily;
    private List<WeeklyGoal> weekly;
    private List<MonthlyGoal> monthly;



}
