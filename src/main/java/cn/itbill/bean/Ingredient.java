package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ingredients")
public class Ingredient {
	@TableId("ingredient_id")
	private Integer ingredient_id;
	private String title;
	private String consumption;
}
