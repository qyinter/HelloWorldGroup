package cn.qianyu.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 食物的实体类
 */
@Data
@Table(name = "hello_food")
public class Food implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer rid;
    private String food_name;
    private String food_details;
    private String food_address;
    private String small_imgs;
    private String big_imgs;
    private String making_method;
    private String food_material;
    private Integer cid;
    private Integer time;
    private Integer energy;
    private String media;


}
