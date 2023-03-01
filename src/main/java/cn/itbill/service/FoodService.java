package cn.itbill.service;

import cn.itbill.mapper.FoodMapper;
import cn.itbill.bean.Food;
import cn.itbill.utils.Result;
import cn.itbill.utils.ResultCode;
import com.alibaba.fastjson2.JSON;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class FoodService extends Service {

	FoodMapper mapper;

	@Autowired
	public FoodService(FoodMapper mapper) {
		this.mapper = mapper;
	}

	public List<Food> selectAllForList() {
		List<Food> foods = mapper.selectAllForList();
		foods.forEach(food -> food.setImg(food.getImg() + "?x-oss-process=style/c320"));
		return foods;
	}

	public Food selectById(String id) {
		return mapper.selectById(Integer.parseInt(id));
	}

	public List<Food> selectTitleByKeyWord(String title) {
		title = "%" + title + "%";
		List<Food> foods = mapper.selectTitleByKeyWord(title);
		return foods;
	}

}
