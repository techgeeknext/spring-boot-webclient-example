package com.techgeeknext.service;

import com.techgeeknext.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface IEmployeeService
{
	Flux<Employee> findAll();
	
	Mono<Employee> findById(Integer id);
 
    Mono<Employee> create(Employee e);
 
    Mono<Employee> update(Employee e);
 
    Mono<Void> delete(Integer id);
}