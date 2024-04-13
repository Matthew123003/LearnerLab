package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Educator educator = Educator.DOLIO;
        // Get the instance of students
        Students students = ZipCodeWilmington.getStudents();

        // Get the list of students
        List<Student> studentList = students.personList;

        // Choose an instructor
        Instructor instructor = educator.getInstructor();

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

