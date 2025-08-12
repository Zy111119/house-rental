package com.example.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 房东信息实体，与数据库房东信息表（landlord）对应
 */
@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@TableName(value = "landlord")
public class Landlord {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 申请人ID，外键，关联用户表
     */
    private Integer userId;
    /**
     * 身份证正面照片
     */
    private String idCardFront;
    /**
     * 身份证反面照片
     */
    private String idCardOpposite;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 是否审核（0-未审核，1-审核通过，2-审核未通过）
     */
    private Boolean isAudit;
    /**
     * 创建时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
