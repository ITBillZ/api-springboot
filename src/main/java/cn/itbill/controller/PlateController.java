package cn.itbill.controller;

import cn.itbill.service.PlateService;
import cn.itbill.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plate")
public class PlateController{

    @Autowired
    PlateService service;

    @RequestMapping("/{plate_id}")
    public String searchById(@PathVariable Integer plate_id) {
        return new Result(service.getById(plate_id)).toString();
    }

    @RequestMapping("/update")
    public String update(
            @RequestParam("plate_id") Integer plate_id,
            @RequestParam("food_id") List<Integer> food_ids) {
        service.update(plate_id, food_ids);
        return Result.getSuccessMsg();
    }
}
