package tws.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(employeeMapper.selectAll());
    }
    
    @PostMapping
    public void insertEmployee(@Param("employee") Employee employee ) {
    	employeeMapper.insertEmployee(employee);
    }
    
    @PutMapping()
    public int updateEmployee(@Param("id") int id,@RequestBody Employee employee ) {
     return employeeMapper.updateEmployee(id, employee); 
    }
    
    @DeleteMapping
    public void deleteEmployee(@Param("id") int id) {
     employeeMapper.deleteEmployee(id);
    }

}
