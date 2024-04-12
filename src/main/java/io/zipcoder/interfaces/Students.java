package io.zipcoder.interfaces;

public final class Students extends People{

    private static final Students inst = new Students();//single instantiation of Students object

    private Students(){//private constructor
        personList.add(new Student(1, "Matt", 0.0));
        personList.add(new Student(2, "Alice", 0.0));
        personList.add(new Student(3, "Jenn", 0.0));
        personList.add(new Student(4, "Andy", 0.0));
        personList.add(new Student(5, "Asan", 0.0));
        personList.add(new Student(6, "Anthony", 0.0));
        personList.add(new Student(7, "Asia", 0.0));
        personList.add(new Student(8, "Jorris", 0.0));
        personList.add(new Student(9, "Mike", 0.0));
        personList.add(new Student(10, "Jake", 0.0));
        personList.add(new Student(11, "Ethan", 0.0));
        personList.add(new Student(12, "Ali", 0.0));
        personList.add(new Student(13, "Chaz", 0.0));
        personList.add(new Student(14, "Nick", 0.0));
        personList.add(new Student(15, "Shijin", 0.0));
        personList.add(new Student(16, "Diksha", 0.0));
        personList.add(new Student(17, "Shaily", 0.0));
        personList.add(new Student(18, "Maryana", 0.0));
        personList.add(new Student(19, "Levanya", 0.0));
        personList.add(new Student(20, "Angelina", 0.0));

    }

    public static Students getInstance(){return inst;}//Gets the instance of students
}
