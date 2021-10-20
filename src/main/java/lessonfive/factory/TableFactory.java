package lessonfive.factory;

import lessonfive.humans.Student;
import lessonfive.humans.Teacher;
import lessonfive.tense.ClassTime;
import lessonfive.tense.DayofWeek;
import lessonfive.university.*;

import java.util.Arrays;

public class TableFactory {
    public void createTable() {
        int time = 0;
        int group = 0;
        int tea = 0;
        int rooms = 0;
        GropFactory gropFactory = new GropFactory();
        Group[] groups = gropFactory.createGroups();

        FacultyFactory facultyFactory = new FacultyFactory();
        Faculty[] faculties = facultyFactory.createAryOfFacult();

        DayofWeek[] dayofWeeks = DayofWeek.values();
        ClassTime[] tame = ClassTime.values();
        TimeTable[] table = new TimeTable[dayofWeeks.length];
        for (int i = 0; i < faculties.length; i++) {
            Faculty faculty = faculties[i];
            Teacher[] tech = getTeacherFacult(faculty);
            Auditory[] aud = getAudithories(faculty);
            System.out.println("Table for faculty " +faculty.getNaming() );
            for (int j = 0; j < table.length; j++) {
                System.out.println(dayofWeeks[j]);
                System.out.println("Time | Corpus | Audithory | Subject | Group");
                table[j] = new TimeTable(dayofWeeks[i]);
                for (int k = 0; k < table[j].getLessons().length; k++) {
                    table[j].getLessons()[k] = new Lesson(tame[time], tech[tea], groups[group]);
                    System.out.print(table[j].getLessons()[k].getClassTime().time + " | "+ aud[rooms].getBuilding() + " | " + aud[rooms].getRoomnumber()+" | ");
                    System.out.println(table[j].getLessons()[k].getTeacher().getSubject() + " | " + table[j].getLessons()[k].getGroup().getDenotation());
                    time++;
                    group++;
                    tea++;
                    rooms++;
                    if (time> tame.length){time =0;}
                    if (group>groups.length){group =0;}
                    if (tea> tech.length){tea =0;}
                    if (rooms> aud.length){rooms =0;}
                }
            }
        }
    }


    public Teacher[] getTeacherFacult(Faculty faculty) {
        int size = 0;
        int position = 0;
        Teacher[] teachers = new Teacher[size];
        for (int i = 0; i < faculty.getCathedra().length; i++) {
            for (int j = 0; j < faculty.getCathedra()[i].getTeachers().length; j++) {
                size++;
                Teacher[] teachersfinal = Arrays.copyOf(teachers, size);
                teachers = teachersfinal;
                teachers[position] = faculty.getCathedra()[i].getTeachers()[j];
                position++;
            }
        }
        return teachers;
    }

    public Auditory[] getAudithories(Faculty faculty) {
        int size = 0;
        int position = 0;
        Auditory[] audith = new Auditory[size];
        for (int i = 0; i < faculty.getCathedra().length; i++) {
            for (int j = 0; j < faculty.getCathedra()[i].getRoom().length; j++) {
                size++;
                Auditory[] audifinal = Arrays.copyOf(audith, size);
                audith = audifinal;
                audith[position] = faculty.getCathedra()[i].getRoom()[j];
                position++;
            }
        }
        return audith;
    }
}

