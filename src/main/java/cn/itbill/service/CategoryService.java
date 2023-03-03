package cn.itbill.service;

import cn.itbill.bean.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface CategoryService extends IService<Category> {
    List<Category> searchForList();
}
