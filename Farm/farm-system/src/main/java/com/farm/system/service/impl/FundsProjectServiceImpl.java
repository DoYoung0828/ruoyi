package com.farm.system.service.impl;

import java.util.List;

import com.farm.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.farm.system.mapper.FundsProjectMapper;
import com.farm.system.domain.FundsProject;
import com.farm.system.service.IFundsProjectService;

@Service
public class FundsProjectServiceImpl implements IFundsProjectService {
    @Autowired
    private FundsProjectMapper fundsProjectMapper;

    @Override
    public FundsProject selectFundsProjectById(Long id) {
        return fundsProjectMapper.selectFundsProjectById(id);
    }

    @Override
    public List<FundsProject> selectFundsProjectList(FundsProject fundsProject) {
        return fundsProjectMapper.selectFundsProjectList(fundsProject);
    }

    @Override
    public int insertFundsProject(FundsProject fundsProject) {
        fundsProject.setCreateTime(DateUtils.getNowDate());
        return fundsProjectMapper.insertFundsProject(fundsProject);
    }

    @Override
    public int updateFundsProject(FundsProject fundsProject) {
        fundsProject.setUpdateTime(DateUtils.getNowDate());
        return fundsProjectMapper.updateFundsProject(fundsProject);
    }

    @Override
    public int deleteFundsProjectByIds(Long[] ids) {
        return fundsProjectMapper.deleteFundsProjectByIds(ids);
    }

    @Override
    public int deleteFundsProjectById(Long id) {
        return fundsProjectMapper.deleteFundsProjectById(id);
    }
}
