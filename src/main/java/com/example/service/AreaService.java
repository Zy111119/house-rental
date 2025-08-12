package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.api.Result;
import com.example.pojo.dto.AreaQueryDto;
import com.example.pojo.entity.Area;

import java.util.List;

/**
 * 地区业务逻辑接口
 */
public interface AreaService extends IService<Area> {
    Result<List<Area>> list(AreaQueryDto areaQueryDto);

    Result<String> update(Area area);
    Result<String> saveEntity(Area area);


}
