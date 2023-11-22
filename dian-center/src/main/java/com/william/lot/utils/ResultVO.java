package com.william.lot.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author li192
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO {

    private int code;       // 状态码
    private String msg;     // 消息提示
    private Object date;    // 数据
}
