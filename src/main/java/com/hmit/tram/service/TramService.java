package com.hmit.tram.service;

import com.hmit.tram.dao.TramMapper;
import com.hmit.tram.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class TramService {
    @Autowired
    TramMapper tramMapper;

    public List<HashMap> getBogieStatusList(BogieVO bogieVO) { return tramMapper.getBogieStatusList(bogieVO); }
    public List<HashMap> getAnomalyList(AnomalyVO anomalyVO) { return tramMapper.getAnomalyList(anomalyVO); }
    public List<HashMap> getTempList(TempVO tempVO) { return tramMapper.getTempList(tempVO); }
    public List<HashMap> getRmsLowList(RmsLowVO rmsLowVO) { return tramMapper.getRmsLowList(rmsLowVO); }
    public List<HashMap> getRmsHighList(RmsHighVO rmsHighVO) { return tramMapper.getRmsHighList(rmsHighVO); }
}