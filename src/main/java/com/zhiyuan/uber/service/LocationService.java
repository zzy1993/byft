package com.zhiyuan.uber.service;

import com.zhiyuan.uber.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocationService {

    List<Location> saveBikeLocation(List<Location> bikeLocations);

    void deleteAll();

    Page<Location> findByMovementStatus(String movementStatus, Pageable pageable);

    Page<Location> findBySerialNumber(String serialNumber, Pageable pageable);

}
