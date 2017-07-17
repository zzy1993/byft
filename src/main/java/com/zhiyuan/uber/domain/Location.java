package com.zhiyuan.uber.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
//@RequiredArgsConstructor
@Entity
@Table(name = "Location")
public class Location {

//    enum gpsStatus{
//        EXCELLENT, OK, UNRELIABLE, BAD, UNKNOWN;
//    }

    public enum MovementStatus{
        STOPPED, IN_MOTION;
    }

    @Id
    @GeneratedValue
    private long id;
    private double latitude;
    private double longitude;
    private MovementStatus movementStatus;

    @Embedded
    private BikeInfo bikeInfo;

    public Location(){
        this.bikeInfo = null;
    }

    @JsonCreator
    private Location(@JsonProperty("serialNumber") String serialNumber){
        this.bikeInfo = new BikeInfo(serialNumber);
    }

    public String getSerialNumber(){
        return this.bikeInfo == null? null: this.bikeInfo.getSerialNumber();
    }
}


