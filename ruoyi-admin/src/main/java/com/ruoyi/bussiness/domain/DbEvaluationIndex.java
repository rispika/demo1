package com.ruoyi.bussiness.domain;

import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评价指标对象 db_evaluation_index
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Data
@TableName("db_evaluation_index")
public class DbEvaluationIndex extends BaseEntity {

private static final long serialVersionUID=1L;

    /** 序号 */
        @TableId(type = IdType.AUTO)
    private Long id;

    /** 评价内容 */
            @Excel(name = "评价内容")
    private String content;

    /** 非常同意 */
            @Excel(name = "非常同意")
    private Long point1;

    /** 比较同意 */
            @Excel(name = "比较同意")
    private Long point2;

    /** 同意 */
            @Excel(name = "同意")
    private Long point3;

    /** 不同意 */
            @Excel(name = "不同意")
    private Long point4;

    /** 非常不同意 */
            @Excel(name = "非常不同意")
    private Long point5;

}