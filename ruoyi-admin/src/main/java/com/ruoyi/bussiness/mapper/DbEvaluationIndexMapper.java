package com.ruoyi.bussiness.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.bussiness.domain.DbEvaluationIndex;

/**
 * 评价Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-14
 */
public interface DbEvaluationIndexMapper extends BaseMapper<DbEvaluationIndex>
{
    /**
     * 查询评价
     *
     * @param id 评价主键
     * @return 评价
     */
    public DbEvaluationIndex selectDbEvaluationIndexById(Long id);

    /**
     * 查询评价列表
     *
     * @param dbEvaluationIndex 评价
     * @return 评价集合
     */
    public List<DbEvaluationIndex> selectDbEvaluationIndexList(DbEvaluationIndex dbEvaluationIndex);

    /**
     * 新增评价
     *
     * @param dbEvaluationIndex 评价
     * @return 结果
     */
    public int insertDbEvaluationIndex(DbEvaluationIndex dbEvaluationIndex);

    /**
     * 修改评价
     *
     * @param dbEvaluationIndex 评价
     * @return 结果
     */
    public int updateDbEvaluationIndex(DbEvaluationIndex dbEvaluationIndex);

    /**
     * 删除评价
     *
     * @param id 评价主键
     * @return 结果
     */
    public int deleteDbEvaluationIndexById(Long id);

    /**
     * 批量删除评价
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDbEvaluationIndexByIds(Long[] ids);
}