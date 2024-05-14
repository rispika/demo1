package com.ruoyi.bussiness.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.bussiness.domain.DbStatus;

/**
 * 状态Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-14
 */
public interface DbStatusMapper extends BaseMapper<DbStatus>
{
    /**
     * 查询状态
     *
     * @param id 状态主键
     * @return 状态
     */
    public DbStatus selectDbStatusById(Long id);

    /**
     * 查询状态列表
     *
     * @param dbStatus 状态
     * @return 状态集合
     */
    public List<DbStatus> selectDbStatusList(DbStatus dbStatus);

    /**
     * 新增状态
     *
     * @param dbStatus 状态
     * @return 结果
     */
    public int insertDbStatus(DbStatus dbStatus);

    /**
     * 修改状态
     *
     * @param dbStatus 状态
     * @return 结果
     */
    public int updateDbStatus(DbStatus dbStatus);

    /**
     * 删除状态
     *
     * @param id 状态主键
     * @return 结果
     */
    public int deleteDbStatusById(Long id);

    /**
     * 批量删除状态
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDbStatusByIds(Long[] ids);
}