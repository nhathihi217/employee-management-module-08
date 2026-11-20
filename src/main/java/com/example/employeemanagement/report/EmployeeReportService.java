package com.example.employeemanagement.report;

import com.example.employeemanagement.employee.EmployeeRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeReportService {
    private final EmployeeRepository employeeRepository;

    public EmployeeReportService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional(readOnly = true)
    @Cacheable("employeeCount")
    public long getTotalEmployeeCount() {
        return employeeRepository.count();
    }
}
