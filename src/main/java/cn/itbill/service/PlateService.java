package cn.itbill.service;

import cn.itbill.bean.Plate;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

public interface PlateService extends IService<Plate>  {
    void update(Integer plate_id, List<Integer> food_ids);
}
