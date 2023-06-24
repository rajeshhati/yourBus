package com.yourBus.yourBus.Repositories;

import com.yourBus.yourBus.Entities.BusOperator;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface BusOperatorRepository extends JpaRepository<BusOperator, Long> {
}