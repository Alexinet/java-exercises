module com.example.task21task22part2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.datatransfer;

    opens com.example.task21task22part2 to javafx.fxml;
    exports com.example.task21task22part2;
}