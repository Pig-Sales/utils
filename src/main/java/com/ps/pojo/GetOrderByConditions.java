package com.ps.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetOrderByConditions {
    private String input_condition;
    private String state;
    private Integer page_size;
    private Integer page_num;
}
