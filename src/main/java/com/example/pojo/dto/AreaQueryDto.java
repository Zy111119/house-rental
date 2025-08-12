package com.example.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 地区查询条件类
 */
@Data
@EqualsAndHashCode(callSuper = true)
//继承定义的基础查询类
public class AreaQueryDto extends QueryDto{
    /**
     * 父级ID
     */
    private  String parentId;
    /**
     * 名称
     */
    private String name;
}
