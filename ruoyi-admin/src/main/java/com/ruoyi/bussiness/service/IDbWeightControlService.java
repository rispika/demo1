package com.ruoyi.bussiness.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.bussiness.domain.DbWeightControl;

/**
 * 评价权重Service接口
 *
 * @author ruoyi
 * @date 2024-05-14
 */
public interface IDbWeightControlService extends IService<DbWeightControl>
{
    /**
     * 查询评价权重
     *
     * @param id 评价权重主键
     * @return 评价权重
     */
    public DbWeightControl selectDbWeightControlById(Long id);

    /**
     * 查询评价权重列表
     *
     * @param dbWeightControl 评价权重
     * @return 评价权重集合
     */
    public List<DbWeightControl> selectDbWeightControlList(DbWeightControl dbWeightControl);

    /**
     * 新增评价权重
     *
     * @param dbWeightControl 评价权重
     * @return 结果
     */
    public int insertDbWeightControl(DbWeightControl dbWeightControl);

    /**
     * 修改评价权重
     *
     * @param dbWeightControl 评价权重
     * @return 结果
     */
    public int updateDbWeightControl(DbWeightControl dbWeightControl);

    /**
     * 批量删除评价权重
     *
     * @param ids 需要删除的评价权重主键集合
     * @return 结果
     */
    public int deleteDbWeightControlByIds(Long[] ids);

    /**
     * 删除评价权重信息
     *
     * @param id 评价权重主键
     * @return 结果
     */
    public int deleteDbWeightControlById(Long id);
}