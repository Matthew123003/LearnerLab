package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(1, "Matt", 0.0);

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(1, "Matt", 0.0);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(1, "Matt", 0.0);
        Double expected = 1.0;

        student.learn(1.0);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
