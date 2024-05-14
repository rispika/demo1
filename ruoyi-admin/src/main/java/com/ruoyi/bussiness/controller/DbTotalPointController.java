package com.ruoyi.bussiness.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.bussiness.domain.DbTotalPoint;
import com.ruoyi.bussiness.service.IDbTotalPointService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评价结果Controller
 * 
 * @author ruoyi
 * @date 2024-05-14
 */
@RestController
@RequestMapping("/bussiness/point")
public class DbTotalPointController extends BaseController
{
    @Autowired
    private IDbTotalPointService dbTotalPointService;

    /**
     * 查询评价结果列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:point:list')")
    @GetMapping("/list")
    public TableDataInfo list(DbTotalPoint dbTotalPoint)
    {
        startPage();
        List<DbTotalPoint> list = dbTotalPointService.selectDbTotalPointList(dbTotalPoint);
        return getDataTable(list);
    }

    /**
     * 导出评价结果列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:point:export')")
    @Log(title = "评价结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DbTotalPoint dbTotalPoint)
    {
        List<DbTotalPoint> list = dbTotalPointService.selectDbTotalPointList(dbTotalPoint);
        ExcelUtil<DbTotalPoint> util = new ExcelUtil<DbTotalPoint>(DbTotalPoint.class);
        util.exportExcel(response, list, "评价结果数据");
    }

    /**
     * 获取评价结果详细信息
     */
    @PreAuthorize("@ss.hasPermi('bussiness:point:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dbTotalPointService.selectDbTotalPointById(id));
    }

    /**
     * 新增评价结果
     */
    @PreAuthorize("@ss.hasPermi('bussiness:point:add')")
    @Log(title = "评价结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DbTotalPoint dbTotalPoint)
    {
        return toAjax(dbTotalPointService.insertDbTotalPoint(dbTotalPoint));
    }

    /**
     * 修改评价结果
     */
    @PreAuthorize("@ss.hasPermi('bussiness:point:edit')")
    @Log(title = "评价结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DbTotalPoint dbTotalPoint)
    {
        return toAjax(dbTotalPointService.updateDbTotalPoint(dbTotalPoint));
    }

    /**
     * 删除评价结果
     */
    @PreAuthorize("@ss.hasPermi('bussiness:point:remove')")
    @Log(title = "评价结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dbTotalPointService.deleteDbTotalPointByIds(ids));
    }
}
