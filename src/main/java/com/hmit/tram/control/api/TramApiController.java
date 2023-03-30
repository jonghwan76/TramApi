package com.hmit.tram.control.api;

import com.hmit.tram.model.*;
import com.hmit.tram.service.TramService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/api/tram/")
public class TramApiController {
    @Autowired
    TramService tramService;

    /**
     * 대차상태 조회
     * @param bogieVO
     * @return
     */
    @RequestMapping("/getBogieStatus")
    @ResponseBody
    public HashMap getBogieStatus(String bogieNo) {
        HashMap hashMap = new HashMap();

        BogieVO bogieVO = new BogieVO();
        List mList = new ArrayList();

        if(bogieNo.equals("all")) {
            bogieVO.setBogieNo(null);
        } else {
            String[] arrBogieNo = bogieNo.split(",");
            ArrayList mNewList = new ArrayList(Arrays.asList(arrBogieNo));
            bogieVO.setBogieNo(mNewList);
        }

        String resultCode = "200";
        String resultMsg = "성공";

        List<HashMap> list = tramService.getBogieStatusList(bogieVO);

        hashMap.put("resultData", list);
        hashMap.put("resultCode", resultCode);
        hashMap.put("resultMsg", resultMsg);

        return hashMap;
    }

    /**
     * 이상점수 차트용 조회
     * @param anomalyVO
     * @return
     */
    @RequestMapping("/getAnomalyList")
    @ResponseBody
    public HashMap getAnomalyList(AnomalyVO anomalyVO) {
        HashMap hashMap = new HashMap();

        String resultCode = "200";
        String resultMsg = "성공";

        List<HashMap> list = tramService.getAnomalyList(anomalyVO);

        hashMap.put("resultData", list);
        hashMap.put("resultCode", resultCode);
        hashMap.put("resultMsg", resultMsg);

        return hashMap;
    }

    /**
     * 이상점수 차트용 조회
     * @param tempVO
     * @return
     */
    @RequestMapping("/getTempList")
    @ResponseBody
    public HashMap getTempList(TempVO tempVO) {
        HashMap hashMap = new HashMap();

        String resultCode = "200";
        String resultMsg = "성공";

        List<HashMap> list = tramService.getTempList(tempVO);

        hashMap.put("resultData", list);
        hashMap.put("resultCode", resultCode);
        hashMap.put("resultMsg", resultMsg);

        return hashMap;
    }

    /**
     * RMS 저주파 영역 차트용 조회
     * @param rmsLowVO
     * @return
     */
    @RequestMapping("/getRmsLowList")
    @ResponseBody
    public HashMap getRmsLowList(RmsLowVO rmsLowVO) {
        HashMap hashMap = new HashMap();

        String resultCode = "200";
        String resultMsg = "성공";

        List<HashMap> list = tramService.getRmsLowList(rmsLowVO);

        hashMap.put("resultData", list);
        hashMap.put("resultCode", resultCode);
        hashMap.put("resultMsg", resultMsg);

        return hashMap;
    }

    /**
     * RMS 고주파 영역 차트용 조회
     * @param rmsHighVO
     * @return
     */
    @RequestMapping("/getRmsHighList")
    @ResponseBody
    public HashMap getRmsLowList(RmsHighVO rmsHighVO) {
        HashMap hashMap = new HashMap();

        String resultCode = "200";
        String resultMsg = "성공";

        List<HashMap> list = tramService.getRmsHighList(rmsHighVO);

        hashMap.put("resultData", list);
        hashMap.put("resultCode", resultCode);
        hashMap.put("resultMsg", resultMsg);

        return hashMap;
    }    
}
