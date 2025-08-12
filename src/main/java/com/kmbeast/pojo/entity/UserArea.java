package com.kmbeast.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 用户常居住地信息实体，与数据库用户常居住地信息表（user_area）对应
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@TableName(value = "user_area")
public class UserArea {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 用户ID，外键，关联用户表
     */
    private Integer userId;
    /**
     * 地区ID，外键，关联地区信息表
     */
    private Integer areaId;
}
