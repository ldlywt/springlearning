package com.ldlywt.springlearning.controller;

import com.ldlywt.springlearning.entity.Area;
import com.ldlywt.springlearning.entity.Result;
import com.ldlywt.springlearning.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 *     author : lex
 *     e-mail : ldlywt@163.com
 *     time   : 2018/05/28
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@RestController
@RequestMapping("/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

//    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    @GetMapping(value = "/listarea")
    private Result listArea(){
        return Result.SuccResult(areaService.getAreaList());
    }

    @GetMapping(value = "/getareabyid")
    private Result getAreaById(Integer id){
        return Result.SuccResult(areaService.getAreaById(id));
    }

    @PostMapping(value = "/addarea")
    private Result addArea(@RequestBody Area area){
        return Result.SuccResult(areaService.addArea(area));
    }

    @PostMapping(value = "/updatearea")
    private Result uodateArea(@RequestBody Area area){
        return Result.SuccResult(areaService.modifyArea(area));
    }

    @RequestMapping(value = "/removeArea")
    private Result removeArea(Integer id){
        return Result.SuccResult(areaService.deleteArea(id));
    }
}
