package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        Person person1 = new Person(1, "Matt");
        Person person2 = new Person(2, "Alice");
        Person person3 = new Person(3, "Jenn");
        People people = new People();
        Integer expected = 3;

        people.add(person1);
        people.add(person2);
        people.add(person3);
        Integer actual = people.count();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemovePerson(){
        Person person1 = new Person(1, "Matt");
        Person person2 = new Person(2, "Alice");
        Person person3 = new Person(3, "Jenn");
        People people = new People();
        Integer expected = 2;

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.remove(person2);
        Integer actual = people.count();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemovePersonById(){
        Person person1 = new Person(1, "Matt");
        Person person2 = new Person(2, "Alice");
        Person person3 = new Person(3, "Jenn");
        People people = new People();
        Integer expected = 2;

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.remove(2);
        Integer actual = people.count();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        Person person1 = new Person(1, "Matt");
        Person person2 = new Person(2, "Alice");
        Person person3 = new Person(3, "Jenn");
        People people = new People();
        Person expected = person2;

        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person actual = people.findById(2);

        Assert.assertEquals(expected, actual);
    }
}
