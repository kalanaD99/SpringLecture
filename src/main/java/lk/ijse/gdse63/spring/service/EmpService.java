package lk.ijse.gdse63.spring.service;

import lk.ijse.gdse63.spring.dto.EmployeeDTO;


public interface EmpService {
    EmployeeDTO saveEmployeee (EmployeeDTO employeeDTO);
    void deleteEmployee (String empId);
    void updateEmployee (String empID,EmployeeDTO employeeDTO);
    EmployeeDTO getEmpbyId (String empID);
}