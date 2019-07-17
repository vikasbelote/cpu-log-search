package com.cpu.cpulogsearch.service;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpu.cpulogsearch.entity.CpuLogEntity;
import com.cpu.cpulogsearch.repository.CpuLogRepository;
import com.cpu.log.utils.dto.CpuLogDTO;

@Service
public class CpuLogService {
	
	
	@Autowired
	private CpuLogRepository cpuLogRepository;
	
	private static final SimpleDateFormat dateFormatForTime = new SimpleDateFormat("HH:mm:ss");
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	public void saveCpuLog(CpuLogDTO cpuLogDTO  ) {
		
		CpuLogEntity cpuLog = new CpuLogEntity();
		cpuLog.setCpuAvailableTime( cpuLogDTO.getCpuAvailableTime() );
		cpuLog.setCpuCount( cpuLogDTO.getCpuCount() );
		cpuLog.setCpuUsage(cpuLogDTO.getCpuUsage());
		cpuLog.setCpuUtilizedTime(cpuLogDTO.getCpuUtilizedTime());
		cpuLog.setCurrentDate(new Date());
		
		cpuLog = cpuLogRepository.save(cpuLog);
	}

}
