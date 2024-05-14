package com.ruoyi.bussiness.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bussiness.mapper.DbStatusMapper;
import com.ruoyi.bussiness.domain.DbStatus;
import com.ruoyi.bussiness.service.IDbStatusService;

/**
 * 状态Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Service
public class DbStatusServiceImpl extends ServiceImpl<DbStatusMapper, DbStatus> implements IDbStatusService
{
    @Autowired
    private DbStatusMapper dbStatusMapper;

    /**
     * 查询状态
     *
     * @param id 状态主键
     * @return 状态
     */
    @Override
    public DbStatus selectDbStatusById(Long id)
    {
        return dbStatusMapper.selectDbStatusById(id);
    }

    /**
     * 查询状态列表
     *
     * @param dbStatus 状态
     * @return 状态
     */
    @Override
    public List<DbStatus> selectDbStatusList(DbStatus dbStatus)
    {
        return dbStatusMapper.selectDbStatusList(dbStatus);
    }

    /**
     * 新增状态
     *
     * @param dbStatus 状态
     * @return 结果
     */
    @Override
    public int insertDbStatus(DbStatus dbStatus)
    {
            return dbStatusMapper.insertDbStatus(dbStatus);
    }

    /**
     * 修改状态
     *
     * @param dbStatus 状态
     * @return 结果
     */
    @Override
    public int updateDbStatus(DbStatus dbStatus)
    {
        return dbStatusMapper.updateDbStatus(dbStatus);
    }

    /**
     * 批量删除状态
     *
     * @param ids 需要删除的状态主键
     * @return 结果
     */
    @Override
    public int deleteDbStatusByIds(Long[] ids)
    {
        return dbStatusMapper.deleteDbStatusByIds(ids);
    }

    /**
     * 删除状态信息
     *
     * @param id 状态主键
     * @return 结果
     */
    @Override
    public int deleteDbStatusById(Long id)
    {
        return dbStatusMapper.deleteDbStatusById(id);
    }
}