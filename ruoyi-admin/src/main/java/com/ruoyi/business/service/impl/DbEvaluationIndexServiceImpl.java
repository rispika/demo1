package com.ruoyi.bussiness.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bussiness.mapper.DbEvaluationIndexMapper;
import com.ruoyi.bussiness.domain.DbEvaluationIndex;
import com.ruoyi.bussiness.service.IDbEvaluationIndexService;

/**
 * 评价Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Service
public class DbEvaluationIndexServiceImpl extends ServiceImpl<DbEvaluationIndexMapper, DbEvaluationIndex> implements IDbEvaluationIndexService
{
    @Autowired
    private DbEvaluationIndexMapper dbEvaluationIndexMapper;

    /**
     * 查询评价
     *
     * @param id 评价主键
     * @return 评价
     */
    @Override
    public DbEvaluationIndex selectDbEvaluationIndexById(Long id)
    {
        return dbEvaluationIndexMapper.selectDbEvaluationIndexById(id);
    }

    /**
     * 查询评价列表
     *
     * @param dbEvaluationIndex 评价
     * @return 评价
     */
    @Override
    public List<DbEvaluationIndex> selectDbEvaluationIndexList(DbEvaluationIndex dbEvaluationIndex)
    {
        return dbEvaluationIndexMapper.selectDbEvaluationIndexList(dbEvaluationIndex);
    }

    /**
     * 新增评价
     *
     * @param dbEvaluationIndex 评价
     * @return 结果
     */
    @Override
    public int insertDbEvaluationIndex(DbEvaluationIndex dbEvaluationIndex)
    {
            return dbEvaluationIndexMapper.insertDbEvaluationIndex(dbEvaluationIndex);
    }

    /**
     * 修改评价
     *
     * @param dbEvaluationIndex 评价
     * @return 结果
     */
    @Override
    public int updateDbEvaluationIndex(DbEvaluationIndex dbEvaluationIndex)
    {
        return dbEvaluationIndexMapper.updateDbEvaluationIndex(dbEvaluationIndex);
    }

    /**
     * 批量删除评价
     *
     * @param ids 需要删除的评价主键
     * @return 结果
     */
    @Override
    public int deleteDbEvaluationIndexByIds(Long[] ids)
    {
        return dbEvaluationIndexMapper.deleteDbEvaluationIndexByIds(ids);
    }

    /**
     * 删除评价信息
     *
     * @param id 评价主键
     * @return 结果
     */
    @Override
    public int deleteDbEvaluationIndexById(Long id)
    {
        return dbEvaluationIndexMapper.deleteDbEvaluationIndexById(id);
    }
}