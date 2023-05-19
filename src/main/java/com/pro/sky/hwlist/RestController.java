package com.pro.sky.hwlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/employee")

public class RestController {
    @GetMapping(path = "/all")
    public String allEmployee() {
        return (Servise.allEmployee());
    }

    @GetMapping(path = "/add")
    public String addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) throws EmployeeNotFoundException {

        Servise.addEmployee(firstName, lastName);
        return Servise.findEmployee(firstName,lastName);
    }


    @GetMapping(path = "/remove")
    public String removeEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) throws EmployeeNotFoundException {

        Servise.removeEmployee(firstName, lastName);
        return Servise.findEmployee(firstName,lastName);
    }

    @GetMapping(path = "/find")
    public String findEmployee(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName) throws EmployeeNotFoundException {

        Servise.findEmployee(firstName, lastName);

        return Servise.findEmployee(firstName,lastName);
    }
}


