package com.nightsbridge.interviews.payrollbatchjob;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Class EmployeeService
 *
 * @author Kingsley Webb
 * Created 12 October 2022 at 09:39
 */
public class EmployeeService {

  private List<Employee> employeeList;

  public List<Employee> getAllEmployees() {
    if (Objects.isNull(employeeList)) {
      this.employeeList = new LinkedList<>();

      this.employeeList.add(Employee.builder()
        .employeeNumber("E734673")
        .firstName("Roger")
        .lastName("Wilco")
          .employeeType("PERMANENT")
        .build());
      this.employeeList.add(Employee.builder()
        .employeeNumber("E6347362")
        .firstName("Anne")
        .lastName("Pouret")
          .employeeType("CONTRACTOR")
        .build());
      this.employeeList.add(Employee.builder()
        .employeeNumber("E6347362")
        .firstName("Mike")
        .lastName("Smith")
        .employeeType("TEMP")
        .build());
    }

    return employeeList;
  }

}
