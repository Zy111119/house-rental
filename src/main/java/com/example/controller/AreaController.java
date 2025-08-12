package com.example.controller;

import com.example.aop.Pager;
import com.example.pojo.api.ApiResult;
import com.example.pojo.api.Result;
import com.example.pojo.dto.AreaQueryDto;
import com.example.pojo.entity.Area;
import com.example.service.AreaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 地区控制器接口
 */

@RestController
@RequestMapping("/area")
public class AreaController {

    @Resource
    private AreaService areaService;

    /**
     * 新增地区信息
     */
    @PostMapping(value = "/{save}")
    @ResponseBody
    public Result<String> sava(@RequestBody Area area) {
        return areaService.saveEntity(area);
    }

    /**
     * 修改地区信息
     */
    @PutMapping(value = "/{update}")
    @ResponseBody
    public Result<String> update(@RequestBody Area area) {
        return areaService.update(area);
    }


    /**
     * 通过ID删除地区信息
     */
    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public Result<String> deleteById(@PathVariable Integer id) {
        areaService.removeById(id);
        return ApiResult.success("地区删除成功");
    }

    /**
     * 查询地区信息
     *
     * @param areaQueryDto 查询参数
     * @return Result<List <Area>> 响应结果
     */
    @Pager//自动分页参数处理
    @PostMapping(value = "/list")
    @ResponseBody
    public Result<List<Area>> query(@RequestBody AreaQueryDto areaQueryDto) {
        return areaService.list(areaQueryDto);
    }

}

