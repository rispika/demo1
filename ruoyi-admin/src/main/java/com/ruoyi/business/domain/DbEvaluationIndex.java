package com.ruoyi.bussiness.domain;

import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评价对象 db_evaluation_index
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Data
@TableName("db_evaluation_index")
public class DbEvaluationIndex extends BaseEntity {

private static final long serialVersionUID=1L;

    /** $column.columnComment */
        @TableId(type = IdType.AUTO)
    private Long id;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long A;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long B;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long C;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long D;

    /** $column.columnComment */
            @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long E;

}