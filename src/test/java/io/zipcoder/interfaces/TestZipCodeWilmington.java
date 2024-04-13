package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        // Create a ZipCodeWilmington instance
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

        // Get the instance of students
        Students students = ZipCodeWilmington.getStudents();

        // Get the list of students
        List<Student> studentList = students.personList;

        // Choose an instructor
        Instructor instructor = (Instructor) ZipCodeWilmington.getInstructors().findById(1);

        // Specify the number of hours
        double numberOfHours = 10.0;

        // Store initial totalStudyTime of each student
        double[] initialStudyTimes = new double[studentList.size()];
        for (int i = 0; i < studentList.size(); i++) {
            Student student = (Student) studentList.get(i);
            initialStudyTimes[i] = student.getTotalStudyTime();
        }

        // Invoke the hostLecture method
        zipCodeWilmington.hostLecture(instructor, numberOfHours);
        double expected = 0;
        double actual = 0;
        // Check each student's totalStudyTime
        for (int i = 0; i < studentList.size(); i++) {
            Student student = (Student) studentList.get(i);
            double expectedStudyTime = initialStudyTimes[i] + numberOfHours / studentList.size();
            expected = expectedStudyTime;
            actual = student.getTotalStudyTime();
        }

        Assert.assertEquals(expected, actual, .00001);
    }
}

