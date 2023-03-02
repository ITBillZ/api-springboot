package cn.itbill.controller;

import cn.itbill.service.CategoryService;
import cn.itbill.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService service;

    @RequestMapping("/{cate_id}")
    public String selectById(@PathVariable Integer cate_id) {
        System.out.println(service.getById(cate_id));
        return new Result(service.getById(cate_id)).toString();
    }
}
