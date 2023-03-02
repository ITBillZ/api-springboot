package cn.itbill.controller;

import cn.itbill.service.IngredientService;
import cn.itbill.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

	@Autowired
	IngredientService service;

	@RequestMapping("/{ingredient_id}")
	public String selectById(@PathVariable Integer ingredient_id) {
		return new Result(service.getById(ingredient_id)).toString();
	}
}
