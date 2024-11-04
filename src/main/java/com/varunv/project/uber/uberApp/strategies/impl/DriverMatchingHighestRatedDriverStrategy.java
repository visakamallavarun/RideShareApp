package com.varunv.project.uber.uberApp.strategies.impl;

import com.varunv.project.uber.uberApp.entities.Driver;
import com.varunv.project.uber.uberApp.entities.RideRequest;
import com.varunv.project.uber.uberApp.repositories.DriverRepository;
import com.varunv.project.uber.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional()
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
