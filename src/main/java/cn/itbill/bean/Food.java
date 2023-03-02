package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@Data
@TableName("foods")
@ToString
public class Food {
    @TableId("food_id")
    private Integer food_id;
    private String title;
    private Timestamp prod_time;
    private String valid_day;
    private String img;
    private Integer price;
    private Integer total_number;
    private Boolean activate;

    private String cate_1;
    private String cate_2;
    private String cook_name;
    private List<Ingredient> ingredients;
}
