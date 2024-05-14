package com.ruoyi.bussiness.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bussiness.mapper.DbTotalPointMapper;
import com.ruoyi.bussiness.domain.DbTotalPoint;
import com.ruoyi.bussiness.service.IDbTotalPointService;

/**
 * 总分Service业务层处理
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
     * 查询总分
     *
     * @param id 总分主键
     * @return 总分
     */
    @Override
    public DbTotalPoint selectDbTotalPointById(Long id)
    {
        return dbTotalPointMapper.selectDbTotalPointById(id);
    }

    /**
     * 查询总分列表
     *
     * @param dbTotalPoint 总分
     * @return 总分
     */
    @Override
    public List<DbTotalPoint> selectDbTotalPointList(DbTotalPoint dbTotalPoint)
    {
        return dbTotalPointMapper.selectDbTotalPointList(dbTotalPoint);
    }

    /**
     * 新增总分
     *
     * @param dbTotalPoint 总分
     * @return 结果
     */
    @Override
    public int insertDbTotalPoint(DbTotalPoint dbTotalPoint)
    {
            return dbTotalPointMapper.insertDbTotalPoint(dbTotalPoint);
    }

    /**
     * 修改总分
     *
     * @param dbTotalPoint 总分
     * @return 结果
     */
    @Override
    public int updateDbTotalPoint(DbTotalPoint dbTotalPoint)
    {
        return dbTotalPointMapper.updateDbTotalPoint(dbTotalPoint);
    }

    /**
     * 批量删除总分
     *
     * @param ids 需要删除的总分主键
     * @return 结果
     */
    @Override
    public int deleteDbTotalPointByIds(Long[] ids)
    {
        return dbTotalPointMapper.deleteDbTotalPointByIds(ids);
    }

    /**
     * 删除总分信息
     *
     * @param id 总分主键
     * @return 结果
     */
    @Override
    public int deleteDbTotalPointById(Long id)
    {
        return dbTotalPointMapper.deleteDbTotalPointById(id);
    }
}