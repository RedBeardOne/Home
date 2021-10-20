package lessonfive.university;

import lessonfive.humans.Student;

public class Group {
    private String denotation;
    private Student[] students;

    public Group(String denotation, Student[] students) {
        this.denotation = denotation;
        this.students = students;
    }

    public String getDenotation() {
        return denotation;
    }
}
