package com.cpu.cpulogsearch;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cpu.cpulogsearch.service.CpuLogService;
import com.cpu.log.utils.CaptureCpuLog;
import com.cpu.log.utils.dto.CpuLogDTO;

@Component
public class CaptureCpuLogSchedular {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Autowired
	private CpuLogService cpuLogService;

	@Scheduled(fixedRate = 10000)
	public void reportCurrentTime() {
		
		System.out.println("The time is now " + dateFormat.format(new Date()));
		CaptureCpuLog captureCpuLog = new CaptureCpuLog(false);
		CpuLogDTO cpuLogDTO = captureCpuLog.createLog();
		cpuLogService.saveCpuLog(cpuLogDTO);
	}
}
