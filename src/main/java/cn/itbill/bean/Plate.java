package cn.itbill.bean;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("plates")
public class Plate {
	private Integer plate_id;
	private Integer food_id;
	private Timestamp time;
}
