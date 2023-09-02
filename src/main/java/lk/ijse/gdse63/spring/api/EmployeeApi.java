package lk.ijse.gdse63.spring.api;

import lk.ijse.gdse63.spring.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeApi {
    @PostMapping
    public void save(@RequestBody EmployeeDTO employee){
        System.out.println("Save Request : "+employee);
    }

    @GetMapping("/{id:\\d{1,3}}")
    public EmployeeDTO search(@PathVariable int id){
        System.out.println("Search Request : "+id);
        return new EmployeeDTO(id, "name", "address", "contactNo");
    }

    @DeleteMapping("/{id:\\d{1,3}}")
    public void delete(@PathVariable int id){
        System.out.println("Delete Request : "+id);
    }

    @PutMapping
    public void update(@RequestBody EmployeeDTO employee){
        System.out.println("Put Mapping : "+employee);
    }
}
