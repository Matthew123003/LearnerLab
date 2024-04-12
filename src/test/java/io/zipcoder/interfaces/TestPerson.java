package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    @Test
    public void personConstructorTest(){
        long expectedId = 1;
        String expectedName = "Matt";
        Person person = new Person(expectedId, expectedName);

        long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest(){
        String expected = "Matt";

        Person person = new Person(1, null);
        person.setName(expected);
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

}
