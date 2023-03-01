package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Data
@TableName("foods")
@ToString
public class Food {
    @TableId("food_id")
    private Integer food_id;
    private String title;
    private String category_title;
    private String cook_name;
    private Date prod_time;
    private String valid_day;
    private String img;
    private List<Ingredient> ingredients;
    private Integer price;
    private Integer total_number;
    private boolean activate;
}
