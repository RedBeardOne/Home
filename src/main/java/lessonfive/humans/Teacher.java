package lessonfive.humans;

public class Teacher{
    private String name;
    private String subject;
    private int age;

    public Teacher(String name, String subject, int age) {
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getAge() {
        return age;
    }
}
