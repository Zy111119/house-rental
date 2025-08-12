package com.kmbeast.pojo.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HouseDepositEnum {
    DEPOSIT_METHOD_1(1, "押一付一"),
    DEPOSIT_METHOD_2(2, "押一付二"),
    DEPOSIT_METHOD_3(3, "押一付三"),
    DEPOSIT_METHOD_4(4, "押二付三");
    /**
     * 类型
     */
    private final Integer type;
    /**
     * 描述
     */
    private final String detail;
}

