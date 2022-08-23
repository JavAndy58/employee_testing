package ru.job4j.employee_testing.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Questionnaire {
    private int id;
    private List<String> text = new ArrayList<>();
    private int numberAnswer;
}
