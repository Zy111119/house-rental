package com.example.pojo.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IsAuditEnum {
    STATUS_1(true, "已审核"),
    STATUS_2(false, "未审核");
    /**
     * 类型
     */
    private final Boolean type;
    /**
     * 描述
     */
    private final String detail;
}
