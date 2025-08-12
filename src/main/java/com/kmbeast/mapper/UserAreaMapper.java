package com.kmbeast.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kmbeast.pojo.dto.AreaQueryDto;
import com.kmbeast.pojo.dto.UserAreaQueryDto;
import com.kmbeast.pojo.entity.Area;
import com.kmbeast.pojo.entity.User;
import com.kmbeast.pojo.entity.UserArea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户常居住地持久化接口
 */
@Mapper
public interface UserAreaMapper extends BaseMapper<UserArea> {

    List<UserArea> list(UserAreaQueryDto userAreaQueryDto);

    Integer listCount(UserAreaQueryDto userAreaQueryDto);
}
