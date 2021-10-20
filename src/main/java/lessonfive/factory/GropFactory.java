package lessonfive.factory;

import lessonfive.humans.Student;
import lessonfive.university.Group;

public class GropFactory {
    String[] bank = {"Zero", "First", "Second", "Third", "Patient", "Lazy", "Smart"};
    public Group[] createGroups() {
        Group[] grops = new Group[bank.length];
        for (int i = 0; i < grops.length; i++) {
            StudentFactory factory = new StudentFactory();
            String name = bank[i];
            Student [] students = factory.createAryOfStudent();
            grops[i] = new Group(name, students);
        }
        return grops;
    }
}
