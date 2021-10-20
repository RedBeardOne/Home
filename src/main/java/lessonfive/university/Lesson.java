package lessonfive.university;

import lessonfive.humans.Teacher;
import lessonfive.tense.ClassTime;

public class Lesson {
    ClassTime classTime;
    Teacher teacher;
    Group group;

    public Lesson(ClassTime classTime, Teacher teacher, Group group) {
        this.classTime = classTime;
        this.teacher = teacher;
        this.group = group;
    }

    public ClassTime getClassTime() {
        return classTime;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }
}
