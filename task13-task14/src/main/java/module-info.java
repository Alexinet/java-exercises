module com.example.task13task14 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.task13task14 to javafx.fxml;
    exports com.example.task13task14;
}