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
        //Learner[] learners = students.personList.toArray(new Learner[0]);
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        //Learner[] learners = students.personList.toArray(new Learner[0]);
        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.getArray(), numberOfHours);

    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        for(Person person : students.personList){
            if(person instanceof Student) {
                Student student = (Student) person;
                studyMap.put(student, student.getTotalStudyTime());
            }
        }
        return studyMap;
    }
}
