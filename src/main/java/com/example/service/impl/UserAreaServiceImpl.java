package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.context.LocalThreadHolder;
import com.example.mapper.UserAreaMapper;
import com.example.pojo.api.ApiResult;
import com.example.pojo.api.Result;
import com.example.pojo.dto.UserAreaQueryDto;
import com.example.pojo.entity.UserArea;
import com.example.service.UserAreaService;
import com.example.utils.AssertUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户常居住地业务逻辑接口实现类
 */
@Service
public class UserAreaServiceImpl extends ServiceImpl<UserAreaMapper, UserArea> implements UserAreaService {
    /**
     * 用户常居住地查询
     * @param userAreaQueryDto 用户常居住地查询条件
     * @return  Result<List<UserArea>>
     */
    @Override
    public Result<List<UserArea>> list(UserAreaQueryDto userAreaQueryDto) {
        List<UserArea> list = this.baseMapper.list(userAreaQueryDto);
        Integer count = this.baseMapper.listCount(userAreaQueryDto);
        return ApiResult.success(list,count);
    }
    /**
     * 用户常居住地修改
     * @param userArea 实体信息
     * @return  Result<String>
     */

    @Override
    public Result<String> update(UserArea userArea) {
        updateById(userArea);
        return ApiResult.success("常居住地绑定成功");
    }



    /**
     * 用户常居住地新增
     * @param userArea 用户id
     * @return  Result<String>
     */
    @Override
    public Result<String> saveEntity(UserArea userArea) {
        UserAreaQueryDto UserAreaQueryDto = new UserAreaQueryDto();
        UserAreaQueryDto.setUserId(LocalThreadHolder.getUserId());
        Integer count = this.baseMapper.listCount(UserAreaQueryDto);
        AssertUtils.isTrue(count == 0, "请不要重复新增常居住地");
        save(userArea);
        return ApiResult.success("常居住地新增成功");
    }
}