package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.dto.UserAreaQueryDto;
import com.example.pojo.entity.UserArea;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户常居住地持久化接口
 */
@Mapper
public interface UserAreaMapper extends BaseMapper<UserArea> {

    List<UserArea> list(UserAreaQueryDto userAreaQueryDto);

    Integer listCount(UserAreaQueryDto userAreaQueryDto);
}