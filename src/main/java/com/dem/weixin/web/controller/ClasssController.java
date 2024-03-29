package com.dem.weixin.web.controller;

import com.dem.weixin.domain.TbClass;
import com.dem.weixin.service.ClassService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by DEM
 */
@Controller
@Api("教室控制器")
public class ClasssController {
    @Autowired
    private ClassService classService;

    @RequestMapping("/getClass/{id}")
    @ResponseBody
    public TbClass getClass(@PathVariable  Long id){
        return classService.selectByPrimaryKey(id);
    }

}
