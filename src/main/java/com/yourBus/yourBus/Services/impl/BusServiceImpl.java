package com.yourBus.yourBus.Services.impl;
import com.yourBus.yourBus.Entities.Bus;
import com.yourBus.yourBus.Repositories.BusRepository;
import com.yourBus.yourBus.Services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;
    @Override
    public Bus createBus(Bus bus) {
        bus.setCreatedAt(new Date());
        bus.setUpdatedAt(new Date());

        return busRepository.save(bus);
    }
}
