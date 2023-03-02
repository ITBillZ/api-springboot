package cn.itbill.service.impl;

import cn.itbill.bean.Plate;
import cn.itbill.mapper.PlateMapper;
import cn.itbill.service.PlateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlateServiceImpl extends ServiceImpl<PlateMapper, Plate> implements PlateService {

	@Autowired
	PlateMapper mapper;

	public void update(Integer plate_id, List<Integer> food_ids) {
		mapper.deleteById(plate_id);  // 先删除plate_id对应的所有记录
		ArrayList<Plate> list = new ArrayList<>();
		food_ids.forEach(food_id -> list.add(
				new Plate(plate_id, food_id, Timestamp.valueOf(LocalDateTime.now()))));
		saveBatch(list);
	}
}
