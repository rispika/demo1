package com.ruoyi.bussiness.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.bussiness.domain.DbTotalPoint;

/**
 * 评价结果Service接口
 *
 * @author ruoyi
 * @date 2024-05-14
 */
public interface IDbTotalPointService extends IService<DbTotalPoint>
{
    /**
     * 查询评价结果
     *
     * @param id 评价结果主键
     * @return 评价结果
     */
    public DbTotalPoint selectDbTotalPointById(Long id);

    /**
     * 查询评价结果列表
     *
     * @param dbTotalPoint 评价结果
     * @return 评价结果集合
     */
    public List<DbTotalPoint> selectDbTotalPointList(DbTotalPoint dbTotalPoint);

    /**
     * 新增评价结果
     *
     * @param dbTotalPoint 评价结果
     * @return 结果
     */
    public int insertDbTotalPoint(DbTotalPoint dbTotalPoint);

    /**
     * 修改评价结果
     *
     * @param dbTotalPoint 评价结果
     * @return 结果
     */
    public int updateDbTotalPoint(DbTotalPoint dbTotalPoint);

    /**
     * 批量删除评价结果
     *
     * @param ids 需要删除的评价结果主键集合
     * @return 结果
     */
    public int deleteDbTotalPointByIds(Long[] ids);

    /**
     * 删除评价结果信息
     *
     * @param id 评价结果主键
     * @return 结果
     */
    public int deleteDbTotalPointById(Long id);
}