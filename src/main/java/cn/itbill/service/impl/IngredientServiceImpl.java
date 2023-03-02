package cn.itbill.service.impl;

import cn.itbill.bean.Ingredient;
import cn.itbill.mapper.IngredientMapper;
import cn.itbill.service.IngredientService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl extends ServiceImpl<IngredientMapper, Ingredient> implements IngredientService {


}
