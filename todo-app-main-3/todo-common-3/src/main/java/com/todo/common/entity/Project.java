package com.todo.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Project")
@Table(name = "project")
public class Project extends BaseEntity {

	@Column(name = "project_name", length = 50)
	private String projectName;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "project_prriority")
	private Integer projectPriority;

	@Column(name = "project_description", length = 1000)
	private String projectDescription;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getProjectPriority() {
		return projectPriority;
	}

	public void setProjectPriority(Integer projectPriority) {
		this.projectPriority = projectPriority;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

}
