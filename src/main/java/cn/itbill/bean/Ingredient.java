package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("ingredients")
public class Ingredient {
	@TableId("ingredient_id")
	private Integer ingredient_id;
	private String title;
	@TableField(exist = false)
	private String consumption;

	private String manufacturer;
	private Timestamp prod_time;
	private Integer valid_day;
}
