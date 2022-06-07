package com.goodcode;

import java.util.ArrayList;
import java.util.List;

// open close principle

interface Student{
    List<StudentDetails> addStudent(String name, int age, int[] marks, List<int[]> marksList);
    void deleteStudent(List<StudentDetails> studentDetailsList);
}

