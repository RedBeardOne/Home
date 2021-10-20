package lessonfive.university;

import lessonfive.humans.Teacher;

public class Cathedra {
    private String title;
    private Teacher[] teachers;
    private Auditory[] room;

    public Cathedra(String title, Teacher[] teachers, Auditory[] room) {
        this.title = title;
        this.teachers = teachers;
        this.room = room;
    }

    public String getTitle() {
        return title;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Auditory[] getRoom() {
        return room;
    }
}
