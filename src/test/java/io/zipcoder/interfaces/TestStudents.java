package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {
    
    @Test
    public void testStudentsSingleton1(){
        Students students = Students.getInstance();
        List<Person> actualStudents = students.personList;
        
        List<Person> expectedStudents = new ArrayList<>();
        expectedStudents.add(new Student(1, "Matt", 0.0));
        expectedStudents.add(new Student(2, "Alice", 0.0));
        expectedStudents.add(new Student(3, "Jenn", 0.0));
        expectedStudents.add(new Student(4, "Andy", 0.0));
        expectedStudents.add(new Student(5, "Asan", 0.0));
        expectedStudents.add(new Student(6, "Anthony", 0.0));
        expectedStudents.add(new Student(7, "Asia", 0.0));
        expectedStudents.add(new Student(8, "Jorris", 0.0));
        expectedStudents.add(new Student(9, "Mike", 0.0));
        expectedStudents.add(new Student(10, "Jake", 0.0));
        expectedStudents.add(new Student(11, "Ethan", 0.0));
        expectedStudents.add(new Student(12, "Ali", 0.0));
        expectedStudents.add(new Student(13, "Chaz", 0.0));
        expectedStudents.add(new Student(14, "Nick", 0.0));
        expectedStudents.add(new Student(15, "Shijin", 0.0));
        expectedStudents.add(new Student(16, "Diksha", 0.0));
        expectedStudents.add(new Student(17, "Shaily", 0.0));
        expectedStudents.add(new Student(18, "Maryana", 0.0));
        expectedStudents.add(new Student(19, "Levanya", 0.0));
        expectedStudents.add(new Student(20, "Angelina", 0.0));

       

        Assert.assertEquals(expectedStudents.size(), actualStudents.size());
    }

//    @Test
//    public void testStudentsSingleton2(){
//        Students students = Students.getInstance();
//        List<Person> actualStudents = students.personList;
//
//        List<Person> expectedStudents = new ArrayList<>();
//        expectedStudents.add(new Student(1, "Matt", 0.0));
//        expectedStudents.add(new Student(2, "Alice", 0.0));
//        expectedStudents.add(new Student(3, "Jenn", 0.0));
//        expectedStudents.add(new Student(4, "Andy", 0.0));
//        expectedStudents.add(new Student(5, "Asan", 0.0));
//        expectedStudents.add(new Student(6, "Anthony", 0.0));
//        expectedStudents.add(new Student(7, "Asia", 0.0));
//        expectedStudents.add(new Student(8, "Jorris", 0.0));
//        expectedStudents.add(new Student(9, "Mike", 0.0));
//        expectedStudents.add(new Student(10, "Jake", 0.0));
//        expectedStudents.add(new Student(11, "Ethan", 0.0));
//        expectedStudents.add(new Student(12, "Ali", 0.0));
//        expectedStudents.add(new Student(13, "Chaz", 0.0));
//        expectedStudents.add(new Student(14, "Nick", 0.0));
//        expectedStudents.add(new Student(15, "Shijin", 0.0));
//        expectedStudents.add(new Student(16, "Diksha", 0.0));
//        expectedStudents.add(new Student(17, "Shaily", 0.0));
//        expectedStudents.add(new Student(18, "Maryana", 0.0));
//        expectedStudents.add(new Student(19, "Levanya", 0.0));
//        expectedStudents.add(new Student(20, "Angelina", 0.0));
//
////        for(Person expectedStudent : expectedStudents){
////            Assert.assertTrue(actualStudents.contains(expectedStudent));
////        }
//    }
}
