package com.yourBus.yourBus.Repositories;
import com.yourBus.yourBus.Entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
