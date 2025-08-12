package com.kmbeast.pojo.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IsSubwayEnum {
    STATUS_1(true, "临近"),
    STATUS_2(false, "非临近");
    /**
     * 类型
     */
    private final Boolean type;
    /**
     * 描述
     */
    private final String detail;
}
