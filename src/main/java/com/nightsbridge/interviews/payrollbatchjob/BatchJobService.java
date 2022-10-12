package com.nightsbridge.interviews.payrollbatchjob;

import java.util.List;

/**
 * Class BatchJobService
 *
 * @author Kingsley Webb
 * Created 12 October 2022 at 09:38
 */
public class BatchJobService {

  public void processMonthlyPayroll() {

    EmployeeService employeeService = new EmployeeService();
    List<Employee> employeeList = employeeService.getAllEmployees();

    for (int i = 0; i < employeeList.size(); i++) {
      PayrollService payrollService = new PayrollService();

      int transferAmount = 0;
      Employee employee = employeeList.get(i);

      if (employee.getEmployeeType().equals("CONTRACTOR")) {
        transferAmount = 100.00 * employee.getHours();
      }

      if (employee.getEmployeeType().equals("FULL_TIME")) {
        transferAmount = 700.00;
      }

      payrollService.transfer(employee, transferAmount);
    }
  }

}
