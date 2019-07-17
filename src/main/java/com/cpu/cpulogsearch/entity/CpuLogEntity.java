package com.cpu.cpulogsearch.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "cpu_log")
public class CpuLogEntity {
	
	@Id
	@GeneratedValue
	@Column( name = "log_id" )
	private Integer id;
	
	@Column( name = "cpu_count" )
	private Integer cpuCount;
	
	@Column( name = "cpu_usage" )
	private Double cpuUsage;
	
	@Column( name = "ip_address_machine" )
	private String ipAddress;
	
	@Column( name = "cpu_utilized_time" )
	private Date cpuUtilizedTime;
	
	@Column( name = "cpu_available_time" )
	private Date cpuAvailableTime;
	
	@Column( name = "cpu_current_time" )
	private Date currentDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public Double getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(Double cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getCpuUtilizedTime() {
		return cpuUtilizedTime;
	}

	public void setCpuUtilizedTime(Date cpuUtilizedTime) {
		this.cpuUtilizedTime = cpuUtilizedTime;
	}

	public Date getCpuAvailableTime() {
		return cpuAvailableTime;
	}

	public void setCpuAvailableTime(Date cpuAvailableTime) {
		this.cpuAvailableTime = cpuAvailableTime;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

}
