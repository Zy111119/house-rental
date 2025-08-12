package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.dto.AreaQueryDto;
import com.example.pojo.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户常居住地持久化接口
 */
@Mapper
public interface AreaMapper extends BaseMapper<Area> {

    List<Area> list(AreaQueryDto areaQueryDto);

    Integer listCount(AreaQueryDto areaQueryDto);
}
