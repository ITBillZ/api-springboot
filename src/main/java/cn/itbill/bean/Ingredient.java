package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ingredients")
public class Ingredient {
	private Integer ingredient_id;
	private String title;
	private String consumption;
}
