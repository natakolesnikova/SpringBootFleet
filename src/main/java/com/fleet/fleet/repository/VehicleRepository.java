package com.fleet.fleet.repository;

import com.fleet.fleet.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    Vehicle findByName(String name);
}
