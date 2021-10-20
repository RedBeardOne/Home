package lessonfive.factory;

import lessonfive.university.Cathedra;
import lessonfive.university.Faculty;

import java.util.Arrays;

public class FacultyFactory {
    private String[] facultnames = {"Economics, management and international business",
            "International education",
            "Computer and information technology",
            "Mechanical engineering and transport"};
    private Cathedra catedra;

    public Faculty[] createAryOfFacult() {
        CathedraFactory factory = new CathedraFactory();
        Cathedra[] cathedras = factory.createAryaCathedras();
        Faculty[] facultys = new Faculty[cathedras.length / 2];
        int starAr = 0;
        int finAr = cathedras.length / 2;
        for (int i = 0; i < facultys.length; i++) {
            double random = Math.random();
            int randomCalimg = (int) (random * facultnames.length);
            String titl = facultnames[randomCalimg];
            Cathedra[] cathedra = Arrays.copyOfRange(cathedras, starAr, finAr);
            facultys[i] = new Faculty(titl, cathedra);
            for (int j = 0; j < i; j++) {
                if (facultys[i].getNaming().equals(facultys[j].getNaming())){
                 createAryOfFacult();
                }
            }
            starAr = finAr;
            finAr = cathedras.length;
        }
        return facultys;
    }
}
