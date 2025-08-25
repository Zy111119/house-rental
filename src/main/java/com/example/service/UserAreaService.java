package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.api.Result;
import com.example.pojo.dto.UserAreaQueryDto;
import com.example.pojo.entity.UserArea;

import java.util.List;

/**
 * 用户常居住地业务逻辑接口
 */
public interface UserAreaService extends IService<UserArea> {

    Result<List<UserArea>> list(UserAreaQueryDto userAreaQueryDto);

    Result<String> update(UserArea userArea);
    Result<String> saveEntity(UserArea userArea);


}