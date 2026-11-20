package com.example.employeemanagement.report;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/reports")
public class EmployeeReportController {
    private final EmployeeReportService reportService;

    public EmployeeReportController(EmployeeReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/employee-count")
    public EmployeeCountResponse getEmployeeCount() {
        return new EmployeeCountResponse(reportService.getTotalEmployeeCount(), Instant.now());
    }

    public record EmployeeCountResponse(long totalEmployees, Instant generatedAt) {}
}
