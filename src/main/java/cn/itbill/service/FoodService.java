package cn.itbill.service;

import cn.itbill.bean.Food;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface FoodService extends IService<Food> {
    List<Food> selectForList(Integer page, Integer pageSize);

    Food selectById(Integer id);

    List<Food> searchByTitleOrCate(String title, String cate);


}
