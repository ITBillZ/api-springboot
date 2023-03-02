package cn.itbill.mapper;

import cn.itbill.bean.Plate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface PlateMapper extends BaseMapper<Plate> {
	void deleteById(Integer plate_id);
}
