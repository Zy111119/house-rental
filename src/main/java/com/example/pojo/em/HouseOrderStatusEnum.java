package com.example.pojo.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HouseOrderStatusEnum {
    STATUS_1(1, "预约中"),
    STATUS_2(2, "已预约"),
    STATUS_3(3, "预约取消"),
    STATUS_4(4, "已取消"),
    STATUS_5(5, "已完成"),;
    /**
     * 类型
     */
    private final Integer type;
    /**
     * 描述
     */
    private final String detail;
}

