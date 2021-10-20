package lessonfive.university;

import lessonfive.humans.Student;
import lessonfive.humans.Teacher;
import lessonfive.tense.ClassTime;
import lessonfive.tense.DayofWeek;
import lessonfive.university.Group;
import lessonfive.university.Lesson;

public class TimeTable {
    DayofWeek dayofWeek;
    Lesson [] lessons = new Lesson[ClassTime.values().length];

    public TimeTable(DayofWeek dayofWeek){
        this.dayofWeek = dayofWeek;
    }

    public TimeTable(DayofWeek dayofWeek, Lesson[] lessons) {
        this.dayofWeek = dayofWeek;
        this.lessons = lessons;
    }

    public DayofWeek getDayofWeek() {
        return dayofWeek;
    }

    public Lesson[] getLessons() {
        return lessons;
    }
}
