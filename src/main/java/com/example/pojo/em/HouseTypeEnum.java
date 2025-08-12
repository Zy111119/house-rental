package com.example.pojo.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HouseTypeEnum {
    APARTMENT(1, "公寓"),
    VILLA(2, "别墅"),
    BUNGALOW(3, "平房"),
    TOWNHOUSE(4, " 联排别墅"),
    DETACHED_HOUSE(5, "独立住宅"),
    COMMERCIAL_HOUSE(6, "商业住宅"),
    SELF_BUILT_HOUSE(7, "自建房");
    /**
     * 类型
     */
    private final Integer type;
    /**
     * 描述
     */
    private final String detail;
}