package lessonfive.factory;

import lessonfive.university.Auditory;

public class AudithoryFactory {
    String[] buildings = {"U1", "U2", "Main", "Central", "Tk", "XK", "Radio Tech"};
    int[] roomnumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 301, 302, 303, 304, 1201, 1203, 1204};

    public Auditory createAudithory() {
        double random = Math.random();
        int randombuild = (int) (random * buildings.length);
        random = Math.random();
        int randomnumb = (int) (random * roomnumber.length);
        Auditory audithory = new Auditory(buildings[randombuild], roomnumber[randomnumb]);
        if (!audithory.getBuilding().equals("U1") && audithory.getRoomnumber() >= 1201) {
            return createAudithory();
        }
        return audithory;
    }

    public Auditory[] createAryAudithore() {
        Auditory[] aryOfaudithore = new Auditory[roomnumber.length];
        AudithoryFactory factory = new AudithoryFactory();
        for (int i = 0; i < aryOfaudithore.length; i++) {
            aryOfaudithore[i] = factory.createAudithory();
            for (int j = 0; j < i; j++) {
                if (aryOfaudithore[j].getRoomnumber() == aryOfaudithore[i].getRoomnumber()) {
                    aryOfaudithore[i] = factory.createAudithory();
                }
            }
        }
        return aryOfaudithore;
    }
}

