package lessonfive;

import lessonfive.factory.FacultyFactory;
import lessonfive.factory.TableFactory;
import lessonfive.university.Cathedra;
import lessonfive.university.Faculty;
import lessonfive.university.TimeTable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TableFactory factory = new TableFactory();
        factory.createTable();
    }
}

