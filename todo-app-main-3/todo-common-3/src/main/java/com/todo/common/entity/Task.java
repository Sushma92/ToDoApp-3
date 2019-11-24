package com.todo.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Task")
@Table(name = "task")
public class Task extends BaseEntity{

	@Column(name = "task_name", length = 50)
	private String taskName;

	@Column(name = "date")
	private Date date;

	@Column(name = "hours")
	private Integer hours;

	@Column(name = "minutes")
	private Integer minutes;

	@Column(name = "seconds")
	private Integer seconds;

	@Column(name = "task_description", length = 1000)
	private String taskDescription;

	@Column(name = "task_priority")
	private Integer taskPriority;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Integer getPriority() {
		return taskPriority;
	}

	public void setPriority(Integer taskPriority) {
		this.taskPriority = taskPriority;
	}

}
