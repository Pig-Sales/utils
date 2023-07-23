package com.ps.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Today_Price {
    private String today_price_id;
    private Float today_price;
    private String today_price_time;
    private String create_time;
    private String update_time;
}
