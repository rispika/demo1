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
import com.ruoyi.bussiness.domain.DbStatus;
import com.ruoyi.bussiness.service.IDbStatusService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 状态Controller
 * 
 * @author ruoyi
 * @date 2024-05-14
 */
@RestController
@RequestMapping("/bussiness/status")
public class DbStatusController extends BaseController
{
    @Autowired
    private IDbStatusService dbStatusService;

    /**
     * 查询状态列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:status:list')")
    @GetMapping("/list")
    public TableDataInfo list(DbStatus dbStatus)
    {
        startPage();
        List<DbStatus> list = dbStatusService.selectDbStatusList(dbStatus);
        return getDataTable(list);
    }

    /**
     * 导出状态列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:status:export')")
    @Log(title = "状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DbStatus dbStatus)
    {
        List<DbStatus> list = dbStatusService.selectDbStatusList(dbStatus);
        ExcelUtil<DbStatus> util = new ExcelUtil<DbStatus>(DbStatus.class);
        util.exportExcel(response, list, "状态数据");
    }

    /**
     * 获取状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('bussiness:status:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dbStatusService.selectDbStatusById(id));
    }

    /**
     * 新增状态
     */
    @PreAuthorize("@ss.hasPermi('bussiness:status:add')")
    @Log(title = "状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DbStatus dbStatus)
    {
        return toAjax(dbStatusService.insertDbStatus(dbStatus));
    }

    /**
     * 修改状态
     */
    @PreAuthorize("@ss.hasPermi('bussiness:status:edit')")
    @Log(title = "状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DbStatus dbStatus)
    {
        return toAjax(dbStatusService.updateDbStatus(dbStatus));
    }

    /**
     * 删除状态
     */
    @PreAuthorize("@ss.hasPermi('bussiness:status:remove')")
    @Log(title = "状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dbStatusService.deleteDbStatusByIds(ids));
    }
}
