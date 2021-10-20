package lessonfive.factory;

import lessonfive.humans.Teacher;
import lessonfive.university.Auditory;
import lessonfive.university.Cathedra;

import java.util.Arrays;

public class CathedraFactory {
    private String[] titles = {
            "Business analytics",
            "Higher mathematics",
            "Management and taxation",
            "Law"};
    private Teacher[] teachers;
    private Auditory[] rooms;

    public Cathedra[] createAryaCathedras() {

        Cathedra[] catedras = new Cathedra[titles.length];
        TeacherFactory tachfactory = new TeacherFactory();
        AudithoryFactory audifactore = new AudithoryFactory();
        Auditory[] auditories = audifactore.createAryAudithore();
        Teacher[] teachers = tachfactory.createAryTeacher();
        int numb = 0;
        for (int i = 0; i < catedras.length; i++) {
            int sizeCat = numb + 3;
            String title = titles[i];
            Teacher[] teacArry = Arrays.copyOfRange(teachers, numb, sizeCat);
            Auditory[] auditoyArey = Arrays.copyOfRange(auditories, numb, sizeCat);
            catedras[i] = new Cathedra(title, teacArry, auditoyArey);
            numb = numb + 3;
        }
        return catedras;
    }
}
