package com.yourBus.yourBus.Services.impl;
import com.yourBus.yourBus.Entities.Route;
import com.yourBus.yourBus.Repositories.RouteRepository;
import com.yourBus.yourBus.Services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;
    @Override
    public Route createRoute(Route route) {
        route.setCreatedAt(new Date());
        route.setUpdatedAt(new Date());
        return routeRepository.save(route);
    }
}