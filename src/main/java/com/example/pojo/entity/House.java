package com.example.pojo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 房屋实体，与数据库房屋信息表（house）对应
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@TableName(value = "house")
public class House {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 房屋名
     */
    private String name;
    /**
     * 房东ID，外键，关联房东信息表，标识哪个房东发布的房屋信息
     */
    private Integer landlordId;
    /**
     * 所属地区ID，外键，关联地区信息表，标识房屋所属地区
     */
    private Integer areaId;
    /**
     * 所属小区ID，外键，关联小区信息表，标识房屋所属小区
     */
    private Integer communityId;
    /**
     * 房屋描述
     */
    private String detail;
    /**
     * 封面
     */
    private String cover;
    /**
     * 房屋实况图列表
     */
    private String covers;
    /**
     * 房屋类型ID，外键，枚举类定义
     */
    private Integer typeId;
    /**
     * 面积
     */
    private Double sizeNumber;
    /**
     * 方向ID，外键，枚举类定义
     */
    private Integer directionId;
    /**
     * 楼层
     */
    private Integer floor;
    /**
     * 户型ID，外键，枚举类定义
     */
    private Integer sizeId;
    /**
     * 租金
     */
    private BigDecimal rent;
    /**
     * 押金方式ID，外键，枚举类定义
     */
    private Integer depositMethodId;
    /**
     * 房屋状态（1：待租；2：下架），定义枚举类设置
     */
    private Integer status;
    /**
     * 是否临近地图（1：是；0：否）
     */
    private boolean isSubway;
    /**
     * 临近地铁线路（如果临近地铁再设置）
     */
    private Integer subwayLine;
    /**
     * 装修状态ID，外键，定义枚举类设置
     */
    private Integer fitmentStatusId;
    /**
     * 创建时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;



}
