package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static final Instructors inst = new Instructors();//single instantiation of Instructors object

    private Instructors(){//private constructor
        personList.add(new Instructor(1, "Dolio"));
        personList.add(new Instructor(2, "Kris"));
        personList.add(new Instructor(3, "Desa"));
        personList.add(new Instructor(4, "Lossie"));
        personList.add(new Instructor(5, "Dasha"));
        personList.add(new Instructor(6, "Dan"));
        personList.add(new Instructor(7, "Cassie"));
    }

    public static Instructors getInstance(){return inst;}//Gets the instance of instructor

    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }
}
