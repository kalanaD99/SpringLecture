package lk.ijse.gdse63.spring.service.Util;

import lk.ijse.gdse63.spring.dto.EmployeeDTO;
import lk.ijse.gdse63.spring.service.EmpService;
import org.springframework.stereotype.Service;

public class EmpServiceImpl {
    @Service
    public class EmpServiceIMPL implements EmpService {
        @Override
        public EmployeeDTO saveEmployeee(EmployeeDTO employeeDTO) {
            return null;
        }

        @Override
        public void deleteEmployee(String empId) {

        }

        @Override
        public void updateEmployee(String empID, EmployeeDTO employee) {

        }

        @Override
        public EmployeeDTO getEmpbyId(String empID) {
            return null;
        }
    }
}
