package lessonfive.university;

public class Faculty {
    String naming;
    Cathedra [] cathedra;

    public Faculty(String naming, Cathedra[] cathedra) {
        this.naming = naming;
        this.cathedra = cathedra;
    }

    public String getNaming() {
        return naming;
    }

    public Cathedra[] getCathedra() {
        return cathedra;
    }
}
