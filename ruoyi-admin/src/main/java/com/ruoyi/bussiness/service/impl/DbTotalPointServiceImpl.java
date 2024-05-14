package com.ruoyi.bussiness.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bussiness.mapper.DbTotalPointMapper;
import com.ruoyi.bussiness.domain.DbTotalPoint;
import com.ruoyi.bussiness.service.IDbTotalPointService;

/**
 * 评价结果Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Service
public class DbTotalPointServiceImpl extends ServiceImpl<DbTotalPointMapper, DbTotalPoint> implements IDbTotalPointService
{
    @Autowired
    private DbTotalPointMapper dbTotalPointMapper;

    /**
     * 查询评价结果
     *
     * @param id 评价结果主键
     * @return 评价结果
     */
    @Override
    public DbTotalPoint selectDbTotalPointById(Long id)
    {
        return dbTotalPointMapper.selectDbTotalPointById(id);
    }

    /**
     * 查询评价结果列表
     *
     * @param dbTotalPoint 评价结果
     * @return 评价结果
     */
    @Override
    public List<DbTotalPoint> selectDbTotalPointList(DbTotalPoint dbTotalPoint)
    {
        return dbTotalPointMapper.selectDbTotalPointList(dbTotalPoint);
    }

    /**
     * 新增评价结果
     *
     * @param dbTotalPoint 评价结果
     * @return 结果
     */
    @Override
    public int insertDbTotalPoint(DbTotalPoint dbTotalPoint)
    {
            return dbTotalPointMapper.insertDbTotalPoint(dbTotalPoint);
    }

    /**
     * 修改评价结果
     *
     * @param dbTotalPoint 评价结果
     * @return 结果
     */
    @Override
    public int updateDbTotalPoint(DbTotalPoint dbTotalPoint)
    {
        return dbTotalPointMapper.updateDbTotalPoint(dbTotalPoint);
    }

    /**
     * 批量删除评价结果
     *
     * @param ids 需要删除的评价结果主键
     * @return 结果
     */
    @Override
    public int deleteDbTotalPointByIds(Long[] ids)
    {
        return dbTotalPointMapper.deleteDbTotalPointByIds(ids);
    }

    /**
     * 删除评价结果信息
     *
     * @param id 评价结果主键
     * @return 结果
     */
    @Override
    public int deleteDbTotalPointById(Long id)
    {
        return dbTotalPointMapper.deleteDbTotalPointById(id);
    }
}