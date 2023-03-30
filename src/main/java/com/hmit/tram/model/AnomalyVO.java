package com.hmit.tram.model;

import lombok.Data;

import java.util.List;

@Data
public class AnomalyVO {
    private String bogie_no;
    private List bogieNo;
    private String time;
    private String score;
    private String scoreLimit;
    private String scoreMax;
    private String scoreMin;
    private String reg_dt;
    private String mod_dt;
}