package com.zhiyuan.uber.service.impl;

import com.zhiyuan.uber.domain.Location;
import com.zhiyuan.uber.domain.LocationRepository;
import com.zhiyuan.uber.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImplement implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImplement(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> saveBikeLocation(List<Location> bikeLocations) {
        return locationRepository.save(bikeLocations);
    }

    @Override
    public void deleteAll() {
        locationRepository.deleteAll();
    }

    @Override
    public Page<Location> findByMovementStatus(String movementStatus, Pageable pageable) {
        return locationRepository.findByMovementStatus(Location.MovementStatus.valueOf(movementStatus),pageable);
    }

    @Override
    public Page<Location> findBySerialNumber(String serialNumber, Pageable pageable) {
        return locationRepository.findBySerialNumber(serialNumber, pageable);
    }
}
