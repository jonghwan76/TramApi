package com.hmit.tram.dao;

import com.hmit.tram.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface TramMapper {
    List<HashMap> getBogieStatusList(BogieVO bogieVO);
    List<HashMap> getAnomalyList(AnomalyVO anomalyVO);
    List<HashMap> getTempList(TempVO tempVO);
    List<HashMap> getRmsLowList(RmsLowVO rmsLowVO);
    List<HashMap> getRmsHighList(RmsHighVO rmsHighVO);
}