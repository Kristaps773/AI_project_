module com.example.project_ai {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project_ai to javafx.fxml;
    exports com.example.project_ai;
}