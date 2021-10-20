package lessonfive.factory;


import lessonfive.humans.Student;
import lessonfive.university.Group;

public class StudentFactory {
    String[] namebank = {"Kolya", "Sonya", "Galya", "Gena", "Genya", "Olya", "Andrii", "Alexandr", "Serhii", "Darya", "Maxim", "Alexii", "Valeryi", "Oleg"};
    int[] age = {12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public Student createStudent() {
        double random = Math.random();
        int randomname = (int) (random * namebank.length);
        int randomage = (int) (random * age.length);
        Student stud = new Student(namebank[randomname], age[randomage]);
        return stud;
    }

    public Student[] createAryOfStudent() {
        StudentFactory factory = new StudentFactory();
        int randomsize = factory.getRandomNumber(10, 20);
        Student[] aryofstud = new Student[randomsize];
        for (int i = 0; i < aryofstud.length; i++) {
            aryofstud[i] = factory.createStudent();
        }
        return aryofstud;
    }
}
