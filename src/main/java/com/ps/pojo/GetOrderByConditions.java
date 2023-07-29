package com.ps.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetOrderByConditions {
    private String username;
    private String goods_name;
    private String state;
    Integer page_size;
    Integer page_num;

}
