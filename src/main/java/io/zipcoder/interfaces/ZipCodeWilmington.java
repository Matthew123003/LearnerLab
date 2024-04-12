package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington inst = new ZipCodeWilmington();


    public static ZipCodeWilmington getInstance(){return inst;}

    public static Students getStudents(){return students;}

    public static Instructors getInstructors(){return instructors;}

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){

    }

    public Map getStudyMap(){
        return new HashMap<Student, Double>();
    }
}
