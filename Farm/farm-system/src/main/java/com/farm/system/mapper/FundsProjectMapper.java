package com.farm.system.mapper;

import java.util.List;

import com.farm.system.domain.FundsProject;


public interface FundsProjectMapper {

    public FundsProject selectFundsProjectById(Long id);

    public List<FundsProject> selectFundsProjectList(FundsProject fundsProject);

    public int insertFundsProject(FundsProject fundsProject);

    public int updateFundsProject(FundsProject fundsProject);

    public int deleteFundsProjectById(Long id);

    public int deleteFundsProjectByIds(Long[] ids);
}
