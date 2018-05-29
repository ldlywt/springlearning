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

    /**
     *
     * 如果加了@RequestParam : ?后面必须跟(@RequestParam Integer areaId)括号中的areaId,如：http://localhost:8088/ldlywt/area/getareabyid?areaId=2
     * 如果是(Integer id) 拼接是http://localhost:8088/ldlywt/area/getareabyid?id=2
     */
    @GetMapping(value = "/getareabyid")
    private Result getAreaById(@RequestParam Integer areaId){
        return Result.SuccResult(areaService.getAreaById(areaId));
    }

    @PostMapping(value = "/addarea")
    private Result addArea(@RequestBody Area area){
        return Result.SuccResult(areaService.addArea(area));
    }

    @PostMapping(value = "/updatearea")
    private Result uodateArea(@RequestBody Area area){
        return Result.SuccResult(areaService.modifyArea(area));
    }

    @GetMapping(value = "/removeArea")
    private Result removeArea(Integer id){
        return Result.SuccResult(areaService.deleteArea(id));
    }
}
