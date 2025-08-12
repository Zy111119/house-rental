package com.kmbeast.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kmbeast.pojo.api.Result;
import com.kmbeast.pojo.dto.AreaQueryDto;
import com.kmbeast.pojo.dto.UserAreaQueryDto;
import com.kmbeast.pojo.entity.Area;
import com.kmbeast.pojo.entity.UserArea;

import java.util.List;

/**
 * 用户常居住地业务逻辑接口
 */
public interface UserAreaService extends IService<UserArea> {
    static Result<List<UserArea>> list(UserAreaQueryDto userAreaQueryDto);
    Result<String> update(UserArea userArea);
    Result<String> saveEntity(UserArea userArea);


}
