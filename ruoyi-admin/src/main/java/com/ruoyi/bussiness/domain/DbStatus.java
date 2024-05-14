package com.ruoyi.bussiness.domain;

import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 状态对象 db_status
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@Data
@TableName("db_status")
public class DbStatus extends BaseEntity {

private static final long serialVersionUID=1L;

    /** 序号 */
        @TableId(type = IdType.AUTO)
    private Long id;

    /** 学生id */
            @Excel(name = "学生id")
    private Long userId;

    /** 评价状态 */
            @Excel(name = "评价状态")
    private Integer status;

}