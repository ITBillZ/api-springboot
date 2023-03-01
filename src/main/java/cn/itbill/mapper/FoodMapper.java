package cn.itbill.mapper;

import cn.itbill.bean.Food;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodMapper extends BaseMapper<Food> {
    List<Food> selectForList(Integer offset, Integer pageSize);

    Food selectById(Integer id);

    List<Food> searchByTitle(String title);
}
