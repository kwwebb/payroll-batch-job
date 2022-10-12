package com.nightsbridge.interviews.payrollbatchjob;

import lombok.Builder;
import lombok.Data;

/**
 * Class Employee
 *
 * @author Kingsley Webb
 * Created 12 October 2022 at 09:39
 */
@Data
@Builder
public class Employee {

  private String employeeNumber;
  private String firstName;
  private String lastName;
  private double hours;
  private String employeeType;

}
