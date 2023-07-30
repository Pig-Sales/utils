package com.ps.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetGoodsByConditions {
    private Integer page_size;
    private Integer page_num;
    private String input_condition;
    private String order_field;
    private Integer order_type;
}
