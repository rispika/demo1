package com.ruoyi.bussiness.service.impl;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bussiness.mapper.DbWeightControlMapper;
import com.ruoyi.bussiness.domain.DbWeightControl;
import com.ruoyi.bussiness.service.IDbWeightControlService;

/**
 * 权重Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Service
public class DbWeightControlServiceImpl extends ServiceImpl<DbWeightControlMapper, DbWeightControl> implements IDbWeightControlService
{
    @Autowired
    private DbWeightControlMapper dbWeightControlMapper;

    /**
     * 查询权重
     *
     * @param id 权重主键
     * @return 权重
     */
    @Override
    public DbWeightControl selectDbWeightControlById(Long id)
    {
        return dbWeightControlMapper.selectDbWeightControlById(id);
    }

    /**
     * 查询权重列表
     *
     * @param dbWeightControl 权重
     * @return 权重
     */
    @Override
    public List<DbWeightControl> selectDbWeightControlList(DbWeightControl dbWeightControl)
    {
        return dbWeightControlMapper.selectDbWeightControlList(dbWeightControl);
    }

    /**
     * 新增权重
     *
     * @param dbWeightControl 权重
     * @return 结果
     */
    @Override
    public int insertDbWeightControl(DbWeightControl dbWeightControl)
    {
            return dbWeightControlMapper.insertDbWeightControl(dbWeightControl);
    }

    /**
     * 修改权重
     *
     * @param dbWeightControl 权重
     * @return 结果
     */
    @Override
    public int updateDbWeightControl(DbWeightControl dbWeightControl)
    {
        return dbWeightControlMapper.updateDbWeightControl(dbWeightControl);
    }

    /**
     * 批量删除权重
     *
     * @param ids 需要删除的权重主键
     * @return 结果
     */
    @Override
    public int deleteDbWeightControlByIds(Long[] ids)
    {
        return dbWeightControlMapper.deleteDbWeightControlByIds(ids);
    }

    /**
     * 删除权重信息
     *
     * @param id 权重主键
     * @return 结果
     */
    @Override
    public int deleteDbWeightControlById(Long id)
    {
        return dbWeightControlMapper.deleteDbWeightControlById(id);
    }
}