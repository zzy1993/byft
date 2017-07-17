package com.zhiyuan.uber.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface LocationRepository extends JpaRepository<Location, Long>{

    Page<Location> findByMovementStatus(@Param("movementStatus") Location.MovementStatus movementStatus, Pageable pageable);

    Page<Location> findBySerialNumber(@Param("serialNumber") String serialNumber, Pageable pageable);

}
