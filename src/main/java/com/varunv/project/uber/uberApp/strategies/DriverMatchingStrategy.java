package com.varunv.project.uber.uberApp.strategies;

import com.varunv.project.uber.uberApp.entities.Driver;
import com.varunv.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
