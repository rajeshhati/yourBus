package com.yourBus.yourBus.Services.impl;

import com.yourBus.yourBus.Entities.Schedule;
import com.yourBus.yourBus.Repositories.ScheduleRepository;
import com.yourBus.yourBus.Services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public Schedule createSchedule(Schedule schedule) {
        schedule.setCreatedAt(new Date());
        schedule.setUpdatedAt(new Date());
        return scheduleRepository.save(schedule);

    }
}
