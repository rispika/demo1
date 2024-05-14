package com.ruoyi.bussiness.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.bussiness.domain.DbTotalPoint;

/**
 * 总分Service接口
 *
 * @author ruoyi
 * @date 2024-05-14
 */
public interface IDbTotalPointService extends IService<DbTotalPoint>
{
    /**
     * 查询总分
     *
     * @param id 总分主键
     * @return 总分
     */
    public DbTotalPoint selectDbTotalPointById(Long id);

    /**
     * 查询总分列表
     *
     * @param dbTotalPoint 总分
     * @return 总分集合
     */
    public List<DbTotalPoint> selectDbTotalPointList(DbTotalPoint dbTotalPoint);

    /**
     * 新增总分
     *
     * @param dbTotalPoint 总分
     * @return 结果
     */
    public int insertDbTotalPoint(DbTotalPoint dbTotalPoint);

    /**
     * 修改总分
     *
     * @param dbTotalPoint 总分
     * @return 结果
     */
    public int updateDbTotalPoint(DbTotalPoint dbTotalPoint);

    /**
     * 批量删除总分
     *
     * @param ids 需要删除的总分主键集合
     * @return 结果
     */
    public int deleteDbTotalPointByIds(Long[] ids);

    /**
     * 删除总分信息
     *
     * @param id 总分主键
     * @return 结果
     */
    public int deleteDbTotalPointById(Long id);
}