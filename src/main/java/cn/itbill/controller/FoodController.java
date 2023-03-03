package cn.itbill.controller;

import cn.itbill.service.FoodService;
import cn.itbill.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @RequestMapping("/list")
    public String selectForList(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer pageSize) {
        return new Result(foodService.selectForList(page, pageSize)).toString();
    }

    @RequestMapping("/{food_id}")
    public String selectById(@PathVariable Integer food_id) {
        return new Result(foodService.selectById(food_id)).toString();
    }

    @RequestMapping("/search")
    public String search(
            @RequestParam(value = "title", defaultValue = "") String title,
            @RequestParam(value = "cate", defaultValue = "") String cate,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer pageSize) {
        if (!Objects.equals(title, "")) {
            return new Result(foodService.searchByTitle(title)).toString();
        }
        if (!Objects.equals(cate, "")) {
            return new Result(foodService.searchByCate(cate)).toString();
        }
        return new Result(null).toString();
    }
}
