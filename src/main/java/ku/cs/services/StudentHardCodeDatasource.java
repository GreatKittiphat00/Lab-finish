package ku.cs.services;

import ku.cs.models.StudentList;

public class StudentHardCodeDatasource {

    public StudentList readData() {
        StudentList list = new StudentList();
        list.addNewStudent("6410400001", "First", 0);
        list.addNewStudent("6410400002", "Second", 0);
        list.addNewStudent("6410400003", "Third", 0);
        list.addNewStudent("6410400004", "Fourth", 0);
        return list;
    }
}