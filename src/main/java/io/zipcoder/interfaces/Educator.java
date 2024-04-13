package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO(1, "Dolio"),
    KRIS(2, "Kris"),
    DESA(3, "Desa"),
    LOSSIE(4, "Lossie"),
    DASHA(5, "Dasha"),
    DAN(6, "Dan"),
    CASSIE(7, "Cassie");
    double timeWorked;

    // A final field to hold the Instructor instance
    private final Instructor instructor;

    // The constructor for the enum
    Educator(long id, String name) {
        // Instantiate a new Instructor with the given id and name
        instructor = new Instructor(id, name);

        // Add the Instructor to the Instructors singleton
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0.0;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
