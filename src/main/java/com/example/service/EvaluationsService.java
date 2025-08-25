package com.example.service;

import com.example.pojo.api.Result;
import com.example.pojo.dto.EvaluationsQueryDto;
import com.example.pojo.entity.Evaluations;

/**
 * 评论服务接口
 */
public interface EvaluationsService {

    Result<Object> insert(Evaluations evaluations);

    Result<Object> list(Integer contentId, String contentType);

    Result<Object> query(EvaluationsQueryDto evaluationsQueryDto);

    Result<String> deleteById(Integer id);

    Result<Void> update(Evaluations evaluations);

    Result<Object> upvoteOperation(Evaluations evaluations);

}