package Sem3.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String sureName;
    private Integer groupNumber;
    private Integer scholarship;
    private Integer points;
    //private ArrayList<Integer> grade;
}
