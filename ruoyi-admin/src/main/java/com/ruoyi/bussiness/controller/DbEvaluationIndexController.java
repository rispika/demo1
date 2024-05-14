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
import com.ruoyi.bussiness.domain.DbEvaluationIndex;
import com.ruoyi.bussiness.service.IDbEvaluationIndexService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评价指标Controller
 * 
 * @author ruoyi
 * @date 2024-05-14
 */
@RestController
@RequestMapping("/bussiness/index")
public class DbEvaluationIndexController extends BaseController
{
    @Autowired
    private IDbEvaluationIndexService dbEvaluationIndexService;

    /**
     * 查询评价指标列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:index:list')")
    @GetMapping("/list")
    public TableDataInfo list(DbEvaluationIndex dbEvaluationIndex)
    {
        startPage();
        List<DbEvaluationIndex> list = dbEvaluationIndexService.selectDbEvaluationIndexList(dbEvaluationIndex);
        return getDataTable(list);
    }

    /**
     * 导出评价指标列表
     */
    @PreAuthorize("@ss.hasPermi('bussiness:index:export')")
    @Log(title = "评价指标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DbEvaluationIndex dbEvaluationIndex)
    {
        List<DbEvaluationIndex> list = dbEvaluationIndexService.selectDbEvaluationIndexList(dbEvaluationIndex);
        ExcelUtil<DbEvaluationIndex> util = new ExcelUtil<DbEvaluationIndex>(DbEvaluationIndex.class);
        util.exportExcel(response, list, "评价指标数据");
    }

    /**
     * 获取评价指标详细信息
     */
    @PreAuthorize("@ss.hasPermi('bussiness:index:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dbEvaluationIndexService.selectDbEvaluationIndexById(id));
    }

    /**
     * 新增评价指标
     */
    @PreAuthorize("@ss.hasPermi('bussiness:index:add')")
    @Log(title = "评价指标", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DbEvaluationIndex dbEvaluationIndex)
    {
        return toAjax(dbEvaluationIndexService.insertDbEvaluationIndex(dbEvaluationIndex));
    }

    /**
     * 修改评价指标
     */
    @PreAuthorize("@ss.hasPermi('bussiness:index:edit')")
    @Log(title = "评价指标", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DbEvaluationIndex dbEvaluationIndex)
    {
        return toAjax(dbEvaluationIndexService.updateDbEvaluationIndex(dbEvaluationIndex));
    }

    /**
     * 删除评价指标
     */
    @PreAuthorize("@ss.hasPermi('bussiness:index:remove')")
    @Log(title = "评价指标", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dbEvaluationIndexService.deleteDbEvaluationIndexByIds(ids));
    }
}
