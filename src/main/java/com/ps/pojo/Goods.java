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
    private Float min_weight;
    private Float max_weight;
    private Integer goods_number;
    private String goods_type;
    private String seller_willing_start_time;
    private String seller_willing_end_time;
    private String create_time;
    private String update_time;
}
