package ru.job4j.employee_testing.model;

import lombok.Data;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Data
public class Test {
    private int id;
    private Timestamp create;
    private Employee employee;
    private Map<Integer, Integer> tests_list = new HashMap<>();
}
