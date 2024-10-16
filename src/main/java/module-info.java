module org.example.priya11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.priya11 to javafx.fxml;
    exports org.example.priya11;
}