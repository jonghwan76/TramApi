package com.hmit.tram.control;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/")
public class IndexController {
    Logger _logger = LoggerFactory.getLogger( IndexController.class );

    @RequestMapping("/")
    public String index(HttpServletRequest request, ModelMap modelMap) throws Exception {
        return "index";
    }
}