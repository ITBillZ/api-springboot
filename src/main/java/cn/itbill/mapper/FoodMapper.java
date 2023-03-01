package cn.itbill.mapper;

import cn.itbill.bean.Food;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;
import java.util.List;

public interface FoodMapper extends BaseMapper<Food> {
    List<Food> selectAllForList();

    Food selectById(int id);

    List<Food> selectTitleByKeyWord(String title);
}
