package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        Student person1 = new Student(1, "Matt", 0.0);
        Student person2 = new Student(2, "Alice", 0.0);
        Student person3 = new Student(3, "Jenn", 0.0);
        Students students = Students.getInstance();
        Integer expected = 23;

        students.add(person1);
        students.add(person2);
        students.add(person3);
        Integer actual = students.count();
        students.remove(person1);
        students.remove(person2);
        students.remove(person3);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveStudent(){
        Student person1 = new Student(21, "Matt", 0.0);
        Student person2 = new Student(22, "Alice", 0.0);
        Student person3 = new Student(23, "Jenn", 0.0);
        Students students = Students.getInstance();
        Integer expected = 22;

        students.add(person1);
        students.add(person2);
        students.add(person3);
        students.remove(person2);
        Integer actual = students.count();
        students.remove(person1);
        students.remove(person3);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveStudentById(){
        Student person1 = new Student(21, "Matt", 0.0);
        Student person2 = new Student(22, "Alice", 0.0);
        Student person3 = new Student(23, "Jenn", 0.0);
        Students students = Students.getInstance();
        Integer expected = 22;

        students.add(person1);
        students.add(person2);
        students.add(person3);
        students.remove(22);
        Integer actual = students.count();
        students.remove(21);
        students.remove(23);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        Student person1 = new Student(21, "Matt", 0.0);
        Student person2 = new Student(22, "Alice", 0.0);
        Student person3 = new Student(23, "Jenn", 0.0);
        Students students = Students.getInstance();
        Student expected = person2;

        students.add(person1);
        students.add(person2);
        students.add(person3);
        Student actual = students.findById(22);
        students.remove(person1);
        students.remove(person2);
        students.remove(person3);

        Assert.assertEquals(expected, actual);
    }
}
