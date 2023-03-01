package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@TableName("foods")
public class Food {
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
