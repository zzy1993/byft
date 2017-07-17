package com.zhiyuan.uber.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Embeddable
public class BikeInfo {
    private final String serialNumber;
    private String make;

    public BikeInfo(){
        this.serialNumber = "";
    }
}

