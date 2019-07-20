package com.cpu.cpulogsearch;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cpu.cpulogsearch.service.CpuLogService;
import com.cpu.log.utils.dto.CpuLogDTO;

@SpringBootApplication
public class CpuLogSearchApplication {


	public static void main(String[] args) {
		SpringApplication.run(CpuLogSearchApplication.class, args);
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Cpu count equals and greater than : ");
		String cpuCount = scanner.nextLine();
		

		System.out.print("Cpu usage equeals and greater than : ");
		String cpuUsage = scanner.nextLine();
		
		
		CpuLogService cpuLogService = new CpuLogService();
		List<CpuLogDTO> cpuLogDTOList = cpuLogService.getCpuLogDTOList(cpuCount, cpuUsage);
		
		System.out.println("-----------------------------");
		for(CpuLogDTO cpuLogDTO : cpuLogDTOList) {
			System.out.println("CPU Count          : " + cpuLogDTO.getCpuCount());
			System.out.println("CPU Usage          : " + cpuLogDTO.getCpuUsage());
			System.out.println("IP Address         : " + cpuLogDTO.getIpAddress());
			System.out.println("CPU Utilized Time  : " + cpuLogDTO.getCpuUtilizedTime());
			System.out.println("CPU Available Time : " + cpuLogDTO.getCpuAvailableTime());
			System.out.println("CPU Current Time   : " + cpuLogDTO.getCurrentDateTime());
			System.out.println("--------------------------");
		}
		
		
		

		scanner.close();
	}

}
