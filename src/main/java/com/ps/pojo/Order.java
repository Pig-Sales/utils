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
    private String state;//订单目前状态
    private Integer order_number;
    private Float order_price;//订单最终价格
    private Float order_deposit;
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
    //private Integer seller_confirm;
    private Integer buyer_confirm;


    // below are the new ones guys
    private Float seller_price;
    private Float buyer_price;
    private String trading_time;
    private String willing_start_time;
    private String willing_end_time;
    private String checked = "0";//0代表未被查询过，默认为 0
    private Float  willing_min_weight;//最低体重
    private Float willing_max_weight;//最高体重
    private Integer willing_number;//预期交易数量
    private String buyer_name;//买家姓名
    private String description;//其他描述
}
