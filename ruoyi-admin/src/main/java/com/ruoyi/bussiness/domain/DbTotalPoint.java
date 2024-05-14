package com.ruoyi.bussiness.domain;

import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 总分对象 db_total_point
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Data
@TableName("db_total_point")
public class DbTotalPoint extends BaseEntity {

private static final long serialVersionUID=1L;

    /** $column.columnComment */
        @TableId(type = IdType.AUTO)
    private Long id;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long total;

}