package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;

public class StudentControllers {
    @FXML
    private Label nameLabel;

    @FXML
    public void initialize() {
        Student student = new Student("6510405342", "Great Kittiphat", 0);
        showStudent(student);
    }

    private void showStudent(Student student) {
        nameLabel.setText(student.getName());
    }
}
