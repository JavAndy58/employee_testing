package ru.job4j.employee_testing.service;

import ru.job4j.employee_testing.model.Employee;
import ru.job4j.employee_testing.model.Test;

import java.util.List;

public interface testService {
    Test startTest(Employee employee);
    void saveTest(Test test);
    List<Test> findAll();
}
