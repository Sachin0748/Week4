package com.week4.day1.aidrivenresumescreeningsystem;
import java.util.ArrayList;
import java.util.List;
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<JobRole> applicants = new ArrayList<>();
        applicants.add(new SoftwareEngineer("Sachin", 3));
        applicants.add(new DataScientist("Duggu", 20));
        applicants.add(new ProductManager("Deepansh", 1));

        ScreeningPipeline.processResumes(applicants);
    }
}
