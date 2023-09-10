package com.farm.system.service;

import java.util.List;

import com.farm.system.domain.FundsProject;

public interface IFundsProjectService {

    public FundsProject selectFundsProjectById(Long id);

    public List<FundsProject> selectFundsProjectList(FundsProject fundsProject);

    public int insertFundsProject(FundsProject fundsProject);

    public int updateFundsProject(FundsProject fundsProject);

    public int deleteFundsProjectByIds(Long[] ids);

    public int deleteFundsProjectById(Long id);
}
