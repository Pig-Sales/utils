package com.ps.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RedisData {
    private LocalDateTime expire_time;
    private Object data;
}
