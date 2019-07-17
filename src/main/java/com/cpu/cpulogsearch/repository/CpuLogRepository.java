package com.cpu.cpulogsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpu.cpulogsearch.entity.CpuLogEntity;

@Repository
public interface CpuLogRepository extends JpaRepository<CpuLogEntity, Integer> {

}
