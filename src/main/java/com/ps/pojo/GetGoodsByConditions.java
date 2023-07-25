package com.ps.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetGoodsByConditions {
    Integer page_size;
    Integer page_num;
    String input_condition;
    String order_field;
    Integer order_type;
}
