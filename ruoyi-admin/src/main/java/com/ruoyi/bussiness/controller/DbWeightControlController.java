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
import com.ruoyi.bussiness.domain.DbWeightControl;
import com.ruoyi.bussiness.service.IDbWeightControlService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 权重Controller
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@RestController
@RequestMapping("/bussiness/control")
public class DbWeightControlController extends BaseController {
    @Autowired
    private IDbWeightControlService dbWeightControlService;

    /**
     * 查询权重列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:control:list')")
    @GetMapping("/list")
    public TableDataInfo list(DbWeightControl dbWeightControl) {
        startPage();
        List<DbWeightControl> list = dbWeightControlService.selectDbWeightControlList(dbWeightControl);
        return getDataTable(list);
    }

    /**
     * 导出权重列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:control:export')")
    @Log(title = "权重", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DbWeightControl dbWeightControl) {
        List<DbWeightControl> list = dbWeightControlService.selectDbWeightControlList(dbWeightControl);
        ExcelUtil<DbWeightControl> util = new ExcelUtil<DbWeightControl>(DbWeightControl.class);
        util.exportExcel(response, list, "权重数据");
    }

    /**
     * 获取权重详细信息
     */
    @PreAuthorize("@ss.hasPermi('bussiness:control:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(dbWeightControlService.selectDbWeightControlById(id));
    }

    /**
     * 新增权重
     */
    @PreAuthorize("@ss.hasPermi('bussiness:control:add')")
    @Log(title = "权重", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DbWeightControl dbWeightControl) {
        return toAjax(dbWeightControlService.insertDbWeightControl(dbWeightControl));
    }

    /**
     * 修改权重
     */
    @PreAuthorize("@ss.hasPermi('bussiness:control:edit')")
    @Log(title = "权重", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DbWeightControl dbWeightControl) {
        return toAjax(dbWeightControlService.updateDbWeightControl(dbWeightControl));
    }

    /**
     * 删除权重
     */
    @PreAuthorize("@ss.hasPermi('bussiness:control:remove')")
    @Log(title = "权重", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(dbWeightControlService.deleteDbWeightControlByIds(ids));
    }
}
