package com.ps.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Button_Content {
    private String button_name;
    private String function_name;
    private String user_auth;
    private String state;
    private String confirm_button_content;
    private String cancel_button_content;
    private String popup_content;
}
