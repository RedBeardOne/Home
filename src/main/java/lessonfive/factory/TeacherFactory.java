package lessonfive.factory;

import lessonfive.humans.Teacher;

public class TeacherFactory {
    private String[] names = {"Mykolai O.", "Sonya V.", "Galyna F.", "Genadiy A.", "Evgeiy M.", "Olga S.", "Andrii O.", "Alexandr D", "Serhii A.", "Darya H", "Maxim P", "Alexii X.", "Valeryi O.", "Oleg L."};
    private String[] subject = {"Math", "Physiks", "Chem", "English", "Phylosophy", "Sopromath", "Informat", "History", "Technology", "Thermdynamo"};
    private int[] age = {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 50, 55};

    public Teacher createTeacher() {
        double random = Math.random();
        int randomname = (int) (random * names.length);
        random = Math.random();
        int randosubj = (int) (random * subject.length);
        random = Math.random();
        int randomage = (int) (random * age.length);
        Teacher teach = new Teacher(names[randomname], subject[randosubj], age[randomage]);
        return teach;
    }

    public Teacher[] createAryTeacher() {
        TeacherFactory factory = new TeacherFactory();
        Teacher[] aryTeacher = new Teacher[names.length];
        for (int i = 0; i < aryTeacher.length; i++) {
            aryTeacher[i] = factory.createTeacher();
            for (int j = 0; j <= i; j++) {
                if (aryTeacher[j].getSubject().equals(aryTeacher[i].getSubject())) {
                    aryTeacher[i] = factory.createTeacher();
                }
            }
        }
        return aryTeacher;
    }
}

