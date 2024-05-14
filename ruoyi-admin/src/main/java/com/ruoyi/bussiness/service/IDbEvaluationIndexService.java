package com.ruoyi.bussiness.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.bussiness.domain.DbEvaluationIndex;

/**
 * 评价指标Service接口
 *
 * @author ruoyi
 * @date 2024-05-14
 */
public interface IDbEvaluationIndexService extends IService<DbEvaluationIndex>
{
    /**
     * 查询评价指标
     *
     * @param id 评价指标主键
     * @return 评价指标
     */
    public DbEvaluationIndex selectDbEvaluationIndexById(Long id);

    /**
     * 查询评价指标列表
     *
     * @param dbEvaluationIndex 评价指标
     * @return 评价指标集合
     */
    public List<DbEvaluationIndex> selectDbEvaluationIndexList(DbEvaluationIndex dbEvaluationIndex);

    /**
     * 新增评价指标
     *
     * @param dbEvaluationIndex 评价指标
     * @return 结果
     */
    public int insertDbEvaluationIndex(DbEvaluationIndex dbEvaluationIndex);

    /**
     * 修改评价指标
     *
     * @param dbEvaluationIndex 评价指标
     * @return 结果
     */
    public int updateDbEvaluationIndex(DbEvaluationIndex dbEvaluationIndex);

    /**
     * 批量删除评价指标
     *
     * @param ids 需要删除的评价指标主键集合
     * @return 结果
     */
    public int deleteDbEvaluationIndexByIds(Long[] ids);

    /**
     * 删除评价指标信息
     *
     * @param id 评价指标主键
     * @return 结果
     */
    public int deleteDbEvaluationIndexById(Long id);
}