package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Educator educator = Educator.DOLIO;

        Assert.assertTrue(educator instanceof Teacher);
    }

//    @Test
//    public void testInheritance(){
//        Educator educator = Educator.DOLIO;
//
//        Assert.assertTrue(educator instanceof Person);
//    }

    @Test
    public void testTeach(){
        Educator educator = Educator.DOLIO;
        Student student = new Student(1, "Matt", 0.0);
        double expected = 1;

        educator.teach(student, 1.0);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .00001);
    }

    @Test
    public void testLecture(){
        Educator educator = Educator.DOLIO;
        Student student1 = new Student(1, "Matt", 0.0);
        Student student2 = new Student(2, "Jake", 0.0);
        Learner[] learners = {student1, student2};
        double expected = 1.0;

        educator.lecture(learners, 2.0);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        Assert.assertEquals(expected, actual1, .00001);
        Assert.assertEquals(expected, actual2, .00001);
    }
}
