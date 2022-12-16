package com.demo.hotelaria.controllers.mappers;

import com.demo.hotelaria.controllers.EmployeeResponse;
import com.demo.hotelaria.domain.Employee;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeResponseMapper {
    EmployeeResponse toEmployeeResponse(Employee employee);

}
