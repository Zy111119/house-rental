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
 * 房屋预约评价实体，与数据库房屋预约评价表（house_order_evaluations）对应
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@TableName(value = "house_order_evaluations")
public class HouseOrderEvaluations {
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
     * 房屋预约看房订单ID，外键，关联房屋预约看房信息表
     */
    private Integer houseOrderInfoId;
    /**
     * 评价内容
     */
    private String text;
    /**
     * 评分
     */
    private Integer score;
    /**
     * 创建时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
