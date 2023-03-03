package cn.itbill.service.impl;

import cn.itbill.bean.Category;
import cn.itbill.mapper.CategoryMapper;
import cn.itbill.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    CategoryMapper mapper;

    @Override
    public List<Category> searchForList() {
        return mapper.searchForList();
    }
}
