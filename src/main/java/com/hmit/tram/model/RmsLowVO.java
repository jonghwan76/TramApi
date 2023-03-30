package com.hmit.tram.model;

import lombok.Data;

import java.util.List;

@Data
public class RmsLowVO {
    private String idx;
    private String bogie_no;
    private List bogieNo;

    private String time;
    private String rms_low;
    private String rms_low_red;
    private String rms_low_yellow;
    private String rms_low_max;
    private String rms_low_min;
    private String reg_dt;
}