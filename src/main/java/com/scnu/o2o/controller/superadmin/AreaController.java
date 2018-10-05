package com.scnu.o2o.controller.superadmin;

import com.scnu.o2o.domain.Area;
import com.scnu.o2o.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;
    Logger logger = LoggerFactory.getLogger(AreaController.class);

    @RequestMapping(value = "/listareas", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> listArea() {
        logger.info("=============listArea start===============");
        long startTime = System.currentTimeMillis();
        HashMap modleMap = new HashMap();
        List<Area> list;
        try {
            list = areaService.getAllAreas();
            modleMap.put("rows", list);
            modleMap.put("total", list.size());
        } catch (Exception e) {
            modleMap.put("success", false);
            modleMap.put("errMsg", e.toString());
            e.printStackTrace();
        }
        logger.error("===============test error!==============");
        long endTime = System.currentTimeMillis();
        logger.debug("==============costTime:[{}ms]=============",endTime-startTime);
        logger.info("===============listArea end================");
        return modleMap;
    }

  /* @RequestMapping(value = "/listareas", method = RequestMethod.GET)
    public String listArea(Map<String,Object> modleMap) {
        List<Area> list;
        try {
            list = areaService.getAllAreas();
            modleMap.put("rows", list);
            modleMap.put("total", list.size());
        } catch (Exception e) {
            modleMap.put("success", false);
            modleMap.put("errMsg", e.toString());
            e.printStackTrace();
        }
        return "test";
    }*/
}
