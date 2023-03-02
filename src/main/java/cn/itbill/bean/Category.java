package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("categories")
public class Category {
    @TableId("category_id")
    private Integer category_id;

    private String code;
    private String cate_1;
    private String cate_2;

}
