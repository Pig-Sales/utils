package com.ps.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetGoodsByGoodsType {
    private String goods_type;
    private Integer page_size;
    private Integer page_num;
}
