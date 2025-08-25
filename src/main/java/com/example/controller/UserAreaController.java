package com.example.controller;

import com.example.aop.Pager;
import com.example.pojo.api.ApiResult;
import com.example.pojo.api.Result;
import com.example.pojo.dto.*;
import com.example.pojo.entity.UserArea;
import com.example.service.UserAreaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户常居住地控制器接口
 */

@RestController
@RequestMapping("/user_area")
public class UserAreaController {

    @Resource
    private UserAreaService userAreaService;

    /**
     * 新增常居住地信息
     */
    @PostMapping(value = "/{save}")
    @ResponseBody
    public Result<String> sava(@RequestBody UserArea userArea) {
        return userAreaService.saveEntity(userArea);
    }

    /**
     * 修改常居住地信息
     */
    @PutMapping(value = "/{update}")
    @ResponseBody
    public Result<String> update(@RequestBody UserArea userArea) {
        return userAreaService.update(userArea);
    }


    /**
     * 通过ID删除常居住地信息
     */
    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public Result<String> deleteById(@PathVariable Integer id) {
        userAreaService.removeById(id);
        return ApiResult.success("用户常居住地删除成功");
    }

    /**
     * 查询常居住地信息
     *
     * @param userAreaQueryDto 查询参数
     * @return Result<List <UserArea>> 响应结果
     */
    @Pager//自动分页参数处理
    @PostMapping(value = "/list")
    @ResponseBody
    public Result<List<UserArea>> query(@RequestBody UserAreaQueryDto userAreaQueryDto) {
        return userAreaService.list(userAreaQueryDto);
    }

}