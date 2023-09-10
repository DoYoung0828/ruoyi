package com.farm.web.controller.system;

import com.farm.common.annotation.Log;
import com.farm.common.core.controller.BaseController;
import com.farm.common.core.domain.AjaxResult;
import com.farm.common.core.page.TableDataInfo;
import com.farm.common.enums.BusinessType;
import com.farm.system.domain.FundsProject;
import com.farm.system.service.IFundsProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/project")
public class FundsProjectController extends BaseController {

    @Autowired
    private IFundsProjectService fundsProjectService;

    @PreAuthorize("@ss.hasPermi('system:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundsProject fundsProject) {
        startPage();
        List<FundsProject> list = fundsProjectService.selectFundsProjectList(fundsProject);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('system:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(fundsProjectService.selectFundsProjectById(id));
    }

    @PreAuthorize("@ss.hasPermi('system:project:add')")
    @PostMapping
    public AjaxResult add(@RequestBody FundsProject fundsProject) {
        return toAjax(fundsProjectService.insertFundsProject(fundsProject));
    }

    @PreAuthorize("@ss.hasPermi('system:project:edit')")
    @PutMapping
    public AjaxResult edit(@RequestBody FundsProject fundsProject) {
        return toAjax(fundsProjectService.updateFundsProject(fundsProject));
    }

    @PreAuthorize("@ss.hasPermi('system:project:remove')")
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(fundsProjectService.deleteFundsProjectByIds(ids));
    }
}
