module com.example.task11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.task11 to javafx.fxml;
    exports com.example.task11;
}