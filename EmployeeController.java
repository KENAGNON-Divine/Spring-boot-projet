package net.javaguides.springboot.controlleur;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;


@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController



@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;



    @RequestMapping(value = "/getAllEmployees",method = {RequestMethod.GET} )
    @ResponseBody
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }



    @RequestMapping(value = "/createEmployee", method = {RequestMethod.POST})
    @ResponseBody
    public Employee createEmployee(Employee myEmployee)
    {
        employeeService.createEmployee(myEmployee);
        return myEmployee;

    }


    @RequestMapping(value = "/getEmployeeById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id)
    {
        return   employeeService.getEmployeeById(id);

    }


    @RequestMapping(value = "/updateEmployee/{id}", method = {RequestMethod.PUT})
    @ResponseBody
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){

        return employeeService.updateEmployee(id,employeeDetails);
    }

    @RequestMapping (value = "/deleteEmployee/{id}" , method = {RequestMethod.DELETE})
    @ResponseBody
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id)
    {
        return employeeService.deleteEmployee(id);
    }


}
