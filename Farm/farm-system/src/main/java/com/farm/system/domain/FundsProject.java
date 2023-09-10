package com.farm.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.farm.common.annotation.Excel;
import com.farm.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 funds_project
 *
 * @author ruoyi
 * @date 2023-09-09
 */
public class FundsProject extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 项目名称
     */
    @Excel(name = "项目名称")
    private String projectName;

    /**
     * 项目编号
     */
    @Excel(name = "项目编号")
    private String projectNum;

    /**
     * 客户名称
     */
    @Excel(name = "客户名称")
    private String customerName;

    /**
     * 项目状态
     */
    @Excel(name = "项目状态")
    private String projectStatus;

    /**
     * 合同金额
     */
    @Excel(name = "合同金额")
    private String contractAmount;

    /**
     * 项目启动日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "项目启动日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /**
     * 所属部门
     */
    @Excel(name = "所属部门")
    private String dept;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum;
    }

    public String getProjectNum() {
        return projectNum;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setContractAmount(String contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getContractAmount() {
        return contractAmount;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("projectName", getProjectName())
                .append("projectNum", getProjectNum())
                .append("customerName", getCustomerName())
                .append("projectStatus", getProjectStatus())
                .append("contractAmount", getContractAmount())
                .append("startDate", getStartDate())
                .append("dept", getDept())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
