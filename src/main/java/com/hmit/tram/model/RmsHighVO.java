package com.hmit.tram.model;

import lombok.Data;

import java.util.List;

@Data
public class RmsHighVO {
    private String idx;
    private String bogie_no;
    private List bogieNo;

    private String time;
    private String rms_high;
    private String rms_high_red;
    private String rms_high_yellow;
    private String rms_high_max;
    private String rms_high_min;
    private String reg_dt;
}