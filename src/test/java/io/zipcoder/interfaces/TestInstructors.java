package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void testInstructorsSingleton1(){
        Instructors instructors = Instructors.getInstance();
        List<Instructor> actualInstructors = instructors.personList;

        List<Person> expectedInstructors = new ArrayList<>();
        expectedInstructors.add(new Instructor(1, "Dolio"));
        expectedInstructors.add(new Instructor(2, "Kris"));
        expectedInstructors.add(new Instructor(3, "Desa"));
        expectedInstructors.add(new Instructor(4, "Lossie"));
        expectedInstructors.add(new Instructor(5, "Dasha"));
        expectedInstructors.add(new Instructor(6, "Dan"));
        expectedInstructors.add(new Instructor(7, "Cassie"));



        Assert.assertEquals(expectedInstructors.size(), actualInstructors.size());
    }
}
