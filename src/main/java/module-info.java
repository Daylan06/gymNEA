module com.example.gymnea {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.gymnea to javafx.fxml;
    exports com.example.gymnea;
}