package com.example.pojo.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HouseStatusEnum {
    STATUS_1(1, "待租"),
    STATUS_2(2, "下架");
    /**
     * 类型
     */
    private final Integer type;
    /**
     * 描述
     */
    private final String detail;
}

