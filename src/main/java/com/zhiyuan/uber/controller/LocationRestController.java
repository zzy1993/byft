package com.zhiyuan.uber.controller;

import com.zhiyuan.uber.domain.Location;
import com.zhiyuan.uber.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controller(REST) File
@RestController
public class LocationRestController {

    private LocationService locationService;

    @Autowired
    public LocationRestController(LocationService locationService){
        this.locationService = locationService;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<Location> locations) {
        this.locationService.saveBikeLocation(locations);
    }

    @RequestMapping(value = "/purge", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.CREATED)
    public void purge(){
        this.locationService.deleteAll();
    }

    @RequestMapping(value = "/find/movementStatus/{movementStatus}", method = RequestMethod.GET)
    public Page<Location> findByMovementStatus(@PathVariable String movementStatus, @RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return this.locationService.findByMovementStatus(movementStatus, new PageRequest(page, size));
    }

    @RequestMapping(value = "/find/serialNumber/{serialNumber}", method = RequestMethod.GET)
    public Page<Location> findBySerialNumber(@PathVariable String serialNumber, @RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return this.locationService.findBySerialNumber(serialNumber, new PageRequest(page, size));
    }
}
