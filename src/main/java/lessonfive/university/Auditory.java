package lessonfive.university;

public class Auditory {
    String building ;
    int roomnumber;

    public Auditory(String building, int roomnumber) {
        this.building = building;
        this.roomnumber = roomnumber;
    }

    public String getBuilding() {
        return building;
    }

    public int getRoomnumber() {
        return roomnumber;
    }
}
