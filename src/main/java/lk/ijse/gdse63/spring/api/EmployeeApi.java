package lk.ijse.gdse63.spring.api;

import lk.ijse.gdse63.spring.dto.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeApi {
    @PostMapping
    public void save(@RequestBody Employee employee){
        System.out.println("Save Request : "+employee);
    }

    @GetMapping("/{id:\\d{1,3}}")
    public Employee search(@PathVariable int id){
        System.out.println("Search Request : "+id);
        return new Employee(id, "name", "address", "contactNo");
    }

    @DeleteMapping("/{id:\\d{1,3}}")
    public void delete(@PathVariable int id){
        System.out.println("Delete Request : "+id);
    }

    @PutMapping
    public void update(@RequestBody Employee employee){
        System.out.println("Put Mapping : "+employee);
    }


}
