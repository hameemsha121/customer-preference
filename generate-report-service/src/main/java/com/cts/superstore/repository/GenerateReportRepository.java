package com.cts.superstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.superstore.model.GenerateReport;

public interface GenerateReportRepository extends JpaRepository<GenerateReport,Integer> {

}

