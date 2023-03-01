package cn.itbill.mapper;

import cn.itbill.bean.Plate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface PlateMapper extends BaseMapper<Plate> {
	void deleteById(Integer plate_id);

	List<Plate> selectById(int plate_id);
}
