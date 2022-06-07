package com.badcode;

import java.util.List;

public interface Classification {
    int[] classPercentage(List<int[]> marksList, int noOfSubjects);
    void classifyStudent(int classP); // classpercentage || classifyStudent
}
