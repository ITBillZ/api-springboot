package cn.itbill.mapper;

import cn.itbill.bean.Plate;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;


public interface PlateMapper {
	void deleteById(int plate_id);

	void insert(@Param("plate_id") int plate_id, @Param("food_id")int food_id, @Param("time") Timestamp time);

	List<Plate> selectById(int plate_id);
}
