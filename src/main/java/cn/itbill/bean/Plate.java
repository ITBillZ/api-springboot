package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("plates")
public class Plate {
	private int plate_id;
	private int food_id;
	private Timestamp time;
}
