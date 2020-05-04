package com.cts.superstore.service;

import java.util.List;

import com.cts.superstore.entity.GenerateReport;
import com.cts.superstore.model.GenerateReportModel;

public interface GenerateReportService {

	List<GenerateReportModel> getCustomerUpdatedByDate();

}
