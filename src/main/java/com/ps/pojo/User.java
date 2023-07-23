package com.ps.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String user_id;
    private String user_auth;
    private String username;
    private String user_image;
    private String phone_number;
    private String IDcard;
    private String create_time;
    private String update_time;
    private String enterprise_name;
    private String enterprise_image;
    private String address;
    private Integer scale;
    private String bank_card_number;
    private String approved;
}

