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
 * 小区实体，与数据库小区表（community）对应
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@TableName(value = "community")
public class Community {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 地区ID
     */
    private Integer areaId;
    /**
     * 名称
     */
    private String name;
    /**
     * 封面
     */
    private String cover;
    /**
     * 实况图
     */
    private String covers;
    /**
     * 描述
     */
    private String detail;
    /**
     * 创建时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

}
