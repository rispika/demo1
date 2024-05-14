package com.ruoyi.bussiness.domain;

import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评价权重对象 db_weight_control
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Data
@TableName("db_weight_control")
public class DbWeightControl extends BaseEntity {

private static final long serialVersionUID=1L;

    /** 序号 */
        @TableId(type = IdType.AUTO)
    private Long id;

    /** 内容 */
            @Excel(name = "内容")
    private String content;

    /** 权重 */
            @Excel(name = "权重")
    private Long weight;

}