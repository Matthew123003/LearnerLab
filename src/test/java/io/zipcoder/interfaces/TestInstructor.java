package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1, "Matt");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1, "Matt");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(1, "Matt");
        Student student = new Student(1, "Matt", 0.0);
        double expected = 1;

        instructor.teach(student, 1.0);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .00001);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(1, "Matt");
        Student student1 = new Student(1, "Matt", 0.0);
        Student student2 = new Student(2, "Jake", 0.0);
        Learner[] learners = {student1, student2};
        double expected = 1.0;

        instructor.lecture(learners, 2.0);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        Assert.assertEquals(expected, actual1, .00001);
        Assert.assertEquals(expected, actual2, .00001);
    }
}
