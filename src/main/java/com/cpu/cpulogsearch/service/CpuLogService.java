package com.cpu.cpulogsearch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cpu.log.utils.CaptureCpuLog;
import com.cpu.log.utils.dto.CpuLogDTO;

@Service
public class CpuLogService {
	
	private static List<CpuLogDTO> cpuLogDTOList = new ArrayList<CpuLogDTO>();
	
	static {
		CaptureCpuLog captureCpuLog = new CaptureCpuLog();
		cpuLogDTOList = captureCpuLog.getCpuLogDTOList();
	}
	
	public List<CpuLogDTO> getCpuLogDTOList(String cpuCount, String cpuUsage) {
		
		Double cpuCountDoubleValue = Double.parseDouble(cpuCount);
		Double cpuUsages = Double.parseDouble(cpuUsage);
		
		List<CpuLogDTO> searchList = new ArrayList<CpuLogDTO>();
		
		for(CpuLogDTO cpuLogDTO : cpuLogDTOList) {
			
			if(cpuLogDTO.getCpuCount() >= cpuCountDoubleValue) {
				searchList.add(cpuLogDTO);
				continue;
			}
			
			if(cpuLogDTO.getCpuUsage() >= cpuUsages) {
				searchList.add(cpuLogDTO);
			}
		}	
		return cpuLogDTOList;
	}
}
