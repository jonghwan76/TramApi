package com.hmit.tram.model;

import lombok.Data;

import java.util.List;

@Data
public class TempVO {
    private String idx;
    private String bogie_no;
    private List bogieNo;

    private String time;
    private String temp;
    private String temp_red;
    private String temp_yellow;
    private String temp_max;
    private String temp_min;
    private String reg_dt;
}