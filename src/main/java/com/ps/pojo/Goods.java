package com.ps.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private String goods_id;
    private String goods_name;
    private String user_id;
    private String goods_image;
    private Float price;
    private Integer deposit;
    private Float min_weight;
    private Float max_weight;
    private Integer goods_number;
    private String goods_type;
    private String create_time;
    private String update_time;
}
