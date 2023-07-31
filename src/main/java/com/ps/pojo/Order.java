package com.ps.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String order_id;
    private String buyer_id;
    private String seller_id;
    private String goods_id;
    private String goods_name;
    private String goods_image;
    private String state;
    private Integer order_number;
    private Float order_price;
    private Integer order_deposit;
    private String deposit_time;
    private String complete_time;
    private String quarantine_state;
    private String create_time;
    private String update_time;
    private Float actual_weight;
    private Float actual_total_price;
    private String quarantine_image;
    private String quarantine_ask_time;
    private String quarantine_complete_time;
    private String goods_belong;
    private String deposit_belong;
    private Integer seller_confirm;
    private Integer buyer_confirm;


}
