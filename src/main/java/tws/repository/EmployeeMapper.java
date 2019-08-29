package tws.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAll();
    
    List<Employee> selectEmployee();
    void insertEmployee(@Param("employee") Employee employee );
    
    int updateEmployee(@Param("id") int id, @Param("employee") Employee employee);

    int deleteEmployee(@Param("id") int id);
}
