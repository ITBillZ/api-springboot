package cn.itbill.service.impl;

import cn.itbill.mapper.FoodMapper;
import cn.itbill.bean.Food;
import cn.itbill.service.FoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements FoodService {

	@Autowired
	FoodMapper mapper;

	public List<Food> selectForList(Integer page, Integer pageSize) {
		List<Food> foods = mapper.selectForList((page - 1) * pageSize, pageSize);
		foods.forEach(food -> food.setImg(food.getImg() + "?x-oss-process=style/c320"));
		return foods;
	}

	public Food selectById(Integer id) {
		return mapper.selectById(id);
	}

	public List<Food> searchByTitle(String title) {
		title = "%" + title + "%";
		return mapper.searchByTitle(title);
	}

	public List<Food> searchByCate(String cate) {
		cate = "%" + cate + "%";
		return mapper.searchByCate(cate);
	}

}
